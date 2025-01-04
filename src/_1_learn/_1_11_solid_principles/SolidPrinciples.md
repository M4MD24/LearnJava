<div dir="rtl">

# دليل تفصيلي حول مبادئ SOLID في البرمجة بلغة Java

## ما هي مبادئ SOLID؟

مبادئ SOLID هي مجموعة من المبادئ الخمسة التي تهدف إلى تحسين تصميم البرمجيات وجعلها أكثر مرونة وسهولة في التغيير أو التوسع. تم صياغة هذه المبادئ من قبل روبرت سي. مارتن (Robert C. Martin) وتعتبر حجر الزاوية في التصميم الكينوني (Object-Oriented Design).

### المبادئ الخمسة:

1. Single Responsibility Principle (SRP) - **S** - مبدأ المسؤولية الواحدة
2. Open/Closed Principle (OCP) - **O** - مبدأ الفتح/الإغلاق
3. Liskov Substitution Principle (LSP) - **L** - مبدأ استبدال ليسكوف
4. Interface Segregation Principle (ISP) - **I** - مبدأ فصل الواجهات
5. Dependency Inversion Principle (DIP) - **D** - مبدأ عكس التبعية

</div>

---

## 1. Single Responsibility Principle (SRP)

<div dir="rtl">

### التعريف

يجب أن تكون كل **class** مسؤولة عن سبب واحد فقط للتغيير، أي أن تقوم بمهمة واحدة فقط.

### مثال خطأ:

</div>

```java
class Report {
    public void generateReport() {

    }

    public void printReport() {

    }
}
```

<div dir="rtl">

### التصحيح:

</div>

```java
class ReportGenerator {
    public void generateReport() {

    }
}

class ReportPrinter {
    public void printReport() {

    }
}
```

---

## 2. Open/Closed Principle (OCP)

<div dir="rtl">

### التعريف

يجب أن تكون **class** مفتوحة للتوسع لكنها مغلقة للتعديل.

### مثال خطأ:

</div>

```java
class Discount {
    public double calculateDiscount(String type, double price) {
        if (type.equals("Student")) {
            return price * 0.1;
        } else if (type.equals("Senior")) {
            return price * 0.2;
        }
        return 0;
    }
}
```

<div dir="rtl">

### التصحيح:

</div>

```java
interface Discount {
    double calculate(double price);
}

class StudentDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.1;
    }
}

class SeniorDiscount implements Discount {
    public double calculate(double price) {
        return price * 0.2;
    }
}
```

---

## 3. Liskov Substitution Principle (LSP)

<div dir="rtl">

### التعريف

يجب أن تكون **class** الفرعية قابلة للاستبدال بـ **class** الأساسية دون كسر النظام.

### مثال خطأ:

</div>

```java
class Rectangle {
    private int width;
    private int height;

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Rectangle {
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height);
        super.setHeight(height);
    }
}
```

<div dir="rtl">

### التصحيح:

</div>

```java
interface Shape {
    int getArea();
}

abstract class Quadrilateral implements Shape {
    abstract void setWidth(int width);
    abstract void setHeight(int height);
}

class Rectangle extends Quadrilateral {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea() {
        return width * height;
    }
}

class Square extends Quadrilateral {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setWidth(int width) {
        this.side = width;
    }

    public void setHeight(int height) {
        this.side = height;
    }

    public int getArea() {
        return side * side;
    }
}

```

---

## 4. Interface Segregation Principle (ISP)

<div dir="rtl">

### التعريف

يجب ألا تُجبر **class** على تنفيذ واجهات لا تحتاجها.

### مثال خطأ:

</div>

```java
interface Worker {
    void work();

    void eat();
}

class Robot implements Worker {
    public void work() {

    }

    public void eat() {

    }
}
```

<div dir="rtl">

### التصحيح:

</div>

```java
interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Robot implements Workable {
    public void work() {

    }
}

class Human implements Workable, Eatable {
    public void work() {

    }

    public void eat() {

    }
}
```

---

## 5. Dependency Inversion Principle (DIP)

<div dir="rtl">

### التعريف

يجب أن تعتمد **high-level modules** على **abstractions** وليس على **low-level modules**.

### مثال خطأ:

</div>

```java
class Keyboard {

}

class Monitor {

}

class Computer {
    private Keyboard keyboard;
    private Monitor monitor;

    public Computer() {
        this.keyboard = new Keyboard();
        this.monitor = new Monitor();
    }
}
```

<div dir="rtl">

### التصحيح:

</div>

```java
interface InputDevice {

}

class Keyboard implements InputDevice {

}


interface DisplayDevice {

}

class Monitor implements DisplayDevice {

}

class Computer {
    private InputDevice inputDevice;
    private DisplayDevice displayDevice;

    public Computer(InputDevice inputDevice, DisplayDevice displayDevice) {
        this.inputDevice = inputDevice;
        this.displayDevice = displayDevice;
    }
}
```

---

<div dir="rtl">

## الخاتمة

تطبيق مبادئ SOLID يساعد على تحسين جودة الكود، وجعله أكثر مرونة وسهولة للصيانة والتطوير.

هذه الأمثلة قدمت خطوات واضحة لفهم هذه المبادئ وكيفية تصحيح الأخطاء الشائعة عند تصميم الأنظمة.

</div>