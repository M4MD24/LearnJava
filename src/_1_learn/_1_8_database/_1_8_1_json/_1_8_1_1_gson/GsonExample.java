package _1_learn._1_8_database._1_8_1_json._1_8_1_1_gson;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.TypeAdapter;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GsonExample {
    private static final Gson GSON = new Gson();
    private static Map<String, String> map;

    public static void main(final String[] PARAMETERS) {
        convertObjectToJson();
        convertJsonToObject();
        writeJsonToFile();
        readJsonFromFile();
        convertObjectToJsonElement();
        custimzeFieldNaming();
        getTypeAdapter();
        createDelegateAdapter();
        setHTMLExcaping();
        createCustomGsonBuilder();
        serializeNullValues();
        excludeFueldsUsingExcluder();
    }

    private static void excludeFueldsUsingExcluder() {
        System.out.println("12. excluder::");
        final Gson GSON_WITH_EXCLUDER = new GsonBuilder().
                excludeFieldsWithoutExposeAnnotation()
                .create();
        final ExampleObject EXAMPLE_OBJECT = new ExampleObject("included", "excluded");
        final String EXCLUDED_JSON = GSON_WITH_EXCLUDER.toJson(EXAMPLE_OBJECT);
        System.out.print(EXCLUDED_JSON);
    }

    private static void serializeNullValues() {
        System.out.println("11. serializeNulls:");
        final Gson GSON_WITH_NULLS = new GsonBuilder().serializeNulls().create();
        final Map<String, String> MAP_WITH_NULL = new HashMap<>();
        MAP_WITH_NULL.put(
                "key",
                null
        );
        final String NULL_SERIALIZED_JSON = GSON_WITH_NULLS.toJson(MAP_WITH_NULL);
        System.out.println(NULL_SERIALIZED_JSON + "\n");
    }

    private static void createCustomGsonBuilder() {
        System.out.println("10. newBuilder:");
        final Gson CUSTOM_GSON = GSON.newBuilder().serializeNulls().create();
        final String CUSTOM_JSON = CUSTOM_GSON.toJson(null);
        System.out.println(CUSTOM_JSON + "\n");
    }

    private static void setHTMLExcaping() {
        System.out.println("9. htmlSafe:");
        final Gson HTML_SAFE_GSON = new GsonBuilder()
                .disableHtmlEscaping()
                .create();
        final String HTML_JSON = HTML_SAFE_GSON.toJson("<tag>");
        System.out.println(HTML_JSON + "\n");
    }

    private static void createDelegateAdapter() {
        System.out.println("8. getDelegateAdapter:");
        final TypeAdapter<Map> DELEGATE_ADAPTER = GSON.getDelegateAdapter(
                GSON.newBuilder()
                        .create()
                        .excluder(),
                TypeToken.get(Map.class)
        );
        try {
            final String DELEGATED_JSON = DELEGATE_ADAPTER.toJson(map);
            System.out.println(DELEGATED_JSON + "\n");
        } catch (final Exception EXCEPTION) {
            EXCEPTION.printStackTrace();
        }
    }

    private static void getTypeAdapter() {
        System.out.println("7. getAdapter:");
        final TypeAdapter<Map> TYPE_ADAPTER = GSON.getAdapter(Map.class);
        try {
            final String ADAPTED_JSON = TYPE_ADAPTER.toJson(map);
            System.out.println(ADAPTED_JSON + "\n");
        } catch (final Exception EXCEPTION) {
            EXCEPTION.printStackTrace();
        }
    }

    private static void custimzeFieldNaming() {
        System.out.println("6. fieldNamingStrategy:");
        final Gson GSON_WITH_NAMING_STRATEGY = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        final String CUSTOM_NAMING_JSON = GSON_WITH_NAMING_STRATEGY.toJson(map);
        System.out.println(CUSTOM_NAMING_JSON + "\n");
    }

    private static void convertObjectToJsonElement() {
        System.out.println("5. toJsonTree:");
        final JsonElement JSON_ELEMENT = GSON.toJsonTree(map);
        System.out.println(JSON_ELEMENT + "\n");
    }

    private static void readJsonFromFile() {
        System.out.println("4. newJsonReader:");
        try (final JsonReader JSON_READER = GSON.newJsonReader(new FileReader("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_1_gson/output.json"))) {
            JSON_READER.beginObject();
            while (JSON_READER.hasNext()) {
                final String KEY = JSON_READER.nextName(),
                        VALUE = JSON_READER.nextString();
                System.out.println(KEY + " = " + VALUE);
            }
            JSON_READER.endObject();
        } catch (final IOException EXCEPTION) {
            EXCEPTION.printStackTrace();
        }
        System.out.println();
    }

    private static void writeJsonToFile() {
        System.out.println("3. newJsonWriter:");
        try (final JsonWriter JSON_WRITER = GSON.newJsonWriter(new FileWriter("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_1_gson/output.json"))) {
            JSON_WRITER.beginObject();
            JSON_WRITER.name("key1").value("value1");
            JSON_WRITER.name("key2").value("value2");
            JSON_WRITER.endObject();
            System.out.println("JSON written to file" + "\n");
        } catch (final IOException EXCEPTION) {
            EXCEPTION.printStackTrace();
        }
    }

    private static void convertJsonToObject() {
        System.out.println("2. fromJson:");
        final String JSON_CONTENT = "{\"key1\":\"value1\",\"key2\":\"value2\"}";
        map = GSON.fromJson(JSON_CONTENT, Map.class);
        System.out.println(map + "\n");
    }

    private static void convertObjectToJson() {
        System.out.println("1. toJson:");
        final Map<String, String> MAP = new HashMap<>();
        MAP.put("key1", "value1");
        MAP.put("key2", "value2");
        final String JSON_CONTENT = GSON.toJson(MAP);
        System.out.println(JSON_CONTENT + "\n");
    }

    private static class ExampleObject {
        @Expose
        private String included;
        private String excluded;

        ExampleObject(String included, String excluded) {
            this.included = included;
            this.excluded = excluded;
        }
    }
}