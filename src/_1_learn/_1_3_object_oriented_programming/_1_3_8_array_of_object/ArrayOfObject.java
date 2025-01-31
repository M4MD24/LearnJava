package _1_learn._1_3_object_oriented_programming._1_3_8_array_of_object;

class Programmer {
    String name, field;
    byte age;
}

public class ArrayOfObject {
    public static void main(final String[] ARGUMENTS) {
        Programmer abdElRahman = new Programmer();
        abdElRahman.name = "Abd ElRahman";
        abdElRahman.age = 30;
        abdElRahman.field = "Cross-Platform";

        Programmer abdAllay = new Programmer();
        abdAllay.name = "Abd Allah";
        abdAllay.age = 26;
        abdAllay.field = "Full Stack Web";

        Programmer mohamed = new Programmer();
        mohamed.name = "Mohamed";
        mohamed.age = 22;
        mohamed.field = "Native Android";

        Programmer ahmed = new Programmer();
        ahmed.name = "Ahmed";
        ahmed.age = 36;
        ahmed.field = "Front End Web";

        Programmer mahmoud = new Programmer();
        mahmoud.name = "Mahmoud";
        mahmoud.age = 24;
        mahmoud.field = "Back End Web";

        Programmer[] programmers = new Programmer[5];
        byte counter = 0;

        programmers[0] = abdElRahman;
        programmers[1] = abdAllay;
        programmers[2] = mohamed;
        programmers[3] = ahmed;
        programmers[4] = mahmoud;

        for (Programmer item : programmers) { /* (foreach) at this moment is enhanced loop than normal (for loop)! */
            System.out.println("Id: " + counter);
            System.out.println("Name: " + item.name);
            System.out.println("Age: " + item.age);
            System.out.println("Field: " + item.field + "\n");
            ++counter;
        }
    }
}