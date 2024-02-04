package _1_learning._1_2_object_oriented_programming._1_2_13_anonymous_class;

class PolygonClass {
    public void display() {
        System.out.println("Inside the Polygon class");
    }
}

interface PolygonInterface {
    void display1();

    interface InnerInterface {
        void display2();

        void display3();
    }
}

class Anonymous {
    public void InnerClass1() {
        PolygonClass polygonClass = new PolygonClass() { // Creation of anonymous class extending class Polygon
            public void display() {
                System.out.println("Inside an Anonymous class");
            }
        }; // Anonymous Inner Class
        polygonClass.display();
    }

    public void InnerClass2() {
        PolygonInterface polygonInterface = () -> System.out.println("Inside an Anonymous Interface1"); // Creation of anonymous class implementing interface Polygon with single function
        polygonInterface.display1();

        PolygonInterface.InnerInterface polygonInterfaceInnerInterface = new PolygonInterface.InnerInterface() { // Creation of anonymous class implementing interface Polygon with multiple functions
            @Override
            public void display2() {
                System.out.println("Inside an Anonymous Interface2");
            }

            @Override
            public void display3() {
                System.out.println("Inside an Anonymous Interface3");
            }
        };
        polygonInterfaceInnerInterface.display2();
        polygonInterfaceInnerInterface.display3();
    }
}

class AnonymousClass {
    public static void main(String[] args) {
        Anonymous anonymous = new Anonymous();
        anonymous.InnerClass1();
        anonymous.InnerClass2();
    }
}