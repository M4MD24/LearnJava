package _1_learn._1_8_database._1_8_1_json._1_8_1_2_jackson;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.List;
import java.util.Map;

public class JacksonExample {
    public static void main(final String[] ARGUMENTS) throws Exception {
        convertObjectToJson();
        convertJsonToObject();
        writeJsonToFile();
        readJsonFromFile();
        customJsonPropertyNames();
        ignoreFieldsInJson();
        prettyPrintJson();
        handleJsonList();
        parseJsonWithTreeModel();
        convertJsonToMap();
    }

    private static void convertObjectToJson() throws Exception {
        System.out.println("1. convertObjectToJson()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Person PERSON = new Person(
                "Mohamed",
                20
        );
        final String JSON_CONTENT = OBJECT_MAPPER.writeValueAsString(PERSON);
        System.out.println("Object to JSON: " + JSON_CONTENT + "\n");
    }

    private static void convertJsonToObject() throws Exception {
        System.out.println("2. convertJsonToObject()");
        final String JSON_CONTENT = "{\"name\":\"Mohamed\",\"age\":20}";
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Person PERSON = OBJECT_MAPPER.readValue(
                JSON_CONTENT,
                Person.class
        );
        System.out.println("JSON to Object: " + PERSON.name + " - " + PERSON.age + "\n");
    }

    private static void readJsonFromFile() throws Exception {
        System.out.println("3. readJsonFromFile()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Person PERSON = OBJECT_MAPPER.readValue(
                new File("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_2_jackson/output.json"),
                Person.class
        );
        System.out.println("Read from file: " + PERSON.name + " - " + PERSON.age + "\n");
    }

    private static void writeJsonToFile() throws Exception {
        System.out.println("4. writeJsonToFile()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Person PERSON = new Person(
                "Mohamed",
                22
        );
        OBJECT_MAPPER.writeValue(
                new File("src/_1_learn/_1_8_database/_1_8_1_json/_1_8_1_2_jackson/output.json"),
                PERSON
        );
        System.out.println("Written to file: output.json" + "\n");
    }

    private static void customJsonPropertyNames() throws Exception {
        System.out.println("5. customJsonPropertyNames()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final CustomPerson PERSON = new CustomPerson(
                "Mohamed",
                22
        );
        final String JSON_CONTENT = OBJECT_MAPPER.writeValueAsString(PERSON);
        System.out.println("Custom property names: " + JSON_CONTENT + "\n");
    }

    private static void ignoreFieldsInJson() throws Exception {
        System.out.println("6. ignoreFieldsInJson()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final PersonWithIgnore PERSON = new PersonWithIgnore(
                "Mohamed",
                22,
                "1234"
        );
        final String JSON_CONTENT = OBJECT_MAPPER.writeValueAsString(PERSON);
        System.out.println("Ignoring fields: " + JSON_CONTENT + "\n");
    }

    private static void prettyPrintJson() throws Exception {
        System.out.println("7. prettyPrintJson()");
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Person PERSON = new Person(
                "Mohamed",
                22
        );
        final String JSON_CONTENT = OBJECT_MAPPER.writerWithDefaultPrettyPrinter()
                .writeValueAsString(PERSON);
        System.out.println("Pretty printed JSON: \n" + JSON_CONTENT + "\n");
    }

    private static void handleJsonList() throws Exception {
        System.out.println("8. handleJsonList()");
        final String JSON_CONTENT = "[{\"name\":\"Mohamed\",\"age\":22},{\"name\":\"Ahmed\",\"age\":12}]";
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final List<Person> PEOPLE = OBJECT_MAPPER.readValue(
                JSON_CONTENT,
                OBJECT_MAPPER.getTypeFactory()
                        .constructCollectionType(
                                List.class,
                                Person.class
                        )
        );
        System.out.println("JSON List:");
        PEOPLE.forEach(person -> System.out.println(person.name + " - " + person.age));
        System.out.println();
    }

    private static void parseJsonWithTreeModel() throws Exception {
        System.out.println("9. parseJsonWithTreeModel()");
        final String JSON_CONTENT = "{\"name\":\"Mohamed\",\"age\":22}";
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final JsonNode NODE = OBJECT_MAPPER.readTree(JSON_CONTENT);
        System.out.println("Tree Model:");
        System.out.println("Name: " + NODE.get("name").asText());
        System.out.println("Age: " + NODE.get("age").asInt() + "\n");
    }

    private static void convertJsonToMap() throws Exception {
        System.out.println("10. convertJsonToMap()");
        final String JSON_CONTENT = "{\"key1\":\"value1\",\"key2\":\"value2\"}";
        final ObjectMapper OBJECT_MAPPER = new ObjectMapper();
        final Map<String, String> MAP = OBJECT_MAPPER.readValue(
                JSON_CONTENT,
                Map.class
        );
        System.out.print("JSON to Map: " + MAP);
    }

    private static class Person {
        public String name;
        public int age;

        public Person() {
        }

        public Person(final String NAME, final int AGE) {
            this.name = NAME;
            this.age = AGE;
        }
    }

    private static class CustomPerson {
        @JsonProperty("full_name")
        public String name;

        @JsonProperty("years_old")
        public int age;

        public CustomPerson() {
        }

        public CustomPerson(final String NAME, final int AGE) {
            this.name = NAME;
            this.age = AGE;
        }
    }

    private static class PersonWithIgnore {
        public String name;
        public int age;

        @JsonIgnore
        public String ssn;

        public PersonWithIgnore() {
        }

        public PersonWithIgnore(final String NAME, final int AGE, final String SSN) {
            this.name = NAME;
            this.age = AGE;
            this.ssn = SSN;
        }
    }
}