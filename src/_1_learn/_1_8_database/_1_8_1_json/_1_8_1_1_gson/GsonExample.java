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

    public static void main(final String[] PARAMETERS) {
        // 1. toJson - Convert an object to JSON
        Map<String, String> exampleMap = new HashMap<>();
        exampleMap.put("key1", "value1");
        exampleMap.put("key2", "value2");
        String jsonString = GSON.toJson(exampleMap);
        System.out.println("1. toJson:\n" + jsonString + "\n\n");

        // 2. fromJson - Convert JSON to an object
        String jsonInput = "{\"key1\":\"value1\",\"key2\":\"value2\"}";
        Map<String, String> parsedMap = GSON.fromJson(jsonInput, Map.class);
        System.out.println("2. fromJson:\n" + parsedMap + "\n\n");

        // 3. newJsonWriter - Write JSON to a file
        try (JsonWriter writer = GSON.newJsonWriter(new FileWriter("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_2_jackson/_1_8_1_1_1_syntax/output.json"))) {
            writer.beginObject();
            writer.name("key1").value("value1");
            writer.name("key2").value("value2");
            writer.endObject();
            System.out.println("3. newJsonWriter:\nJSON written to file" + "\n\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. newJsonReader - Read JSON from a file
        try (JsonReader reader = GSON.newJsonReader(new FileReader("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_2_jackson/_1_8_1_1_1_syntax/output.json"))) {
            reader.beginObject();
            while (reader.hasNext()) {
                String name = reader.nextName();
                String value = reader.nextString();
                System.out.println("4. newJsonReader:\n" + name + " = " + value + "\n\n");
            }
            reader.endObject();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 5. toJsonTree - Convert an object to a JsonElement
        JsonElement jsonElement = GSON.toJsonTree(exampleMap);
        System.out.println("5. toJsonTree:\n" + jsonElement + "\n\n");

        // 6. fieldNamingStrategy - Customize field naming
        Gson gsonWithNamingStrategy = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();
        String customNamingJson = gsonWithNamingStrategy.toJson(exampleMap);
        System.out.println("6. fieldNamingStrategy:\n" + customNamingJson + "\n\n");

        // 7. getAdapter - Get a TypeAdapter
        TypeAdapter<Map> adapter = GSON.getAdapter(Map.class);
        try {
            String adaptedJson = adapter.toJson(exampleMap);
            System.out.println("7. getAdapter:\n" + adaptedJson + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 8. getDelegateAdapter - Create a delegate adapter
        TypeAdapter<Map> delegateAdapter = GSON.getDelegateAdapter(GSON.newBuilder().create().excluder(), TypeToken.get(Map.class));
        try {
            String delegatedJson = delegateAdapter.toJson(exampleMap);
            System.out.println("8. getDelegateAdapter:\n" + delegatedJson + "\n\n");
        } catch (Exception e) {
            e.printStackTrace();
        }

        // 9. htmlSafe - Set HTML escaping
        Gson htmlSafeGson = new GsonBuilder().disableHtmlEscaping().create();
        String htmlJson = htmlSafeGson.toJson("<tag>");
        System.out.println("9. htmlSafe:\n" + htmlJson + "\n\n");

        // 10. newBuilder - Create a custom GsonBuilder
        Gson customGson = GSON.newBuilder().serializeNulls().create();
        String customJson = customGson.toJson(null);
        System.out.println("10. newBuilder:\n" + customJson + "\n\n");

        // 11. serializeNulls - Serialize null values
        Gson gsonWithNulls = new GsonBuilder().serializeNulls().create();
        Map<String, String> mapWithNull = new HashMap<>();
        mapWithNull.put("key", null);
        String nullSerializedJson = gsonWithNulls.toJson(mapWithNull);
        System.out.println("11. serializeNulls:\n" + nullSerializedJson + "\n\n");

        // 12. excluder - Exclude fields using Excluder
        Gson gsonWithExcluder = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        ExampleObject exampleObject = new ExampleObject("included", "excluded");
        String excludedJson = gsonWithExcluder.toJson(exampleObject);
        System.out.print("12. excluder:\n" + excludedJson + "\n\n");
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