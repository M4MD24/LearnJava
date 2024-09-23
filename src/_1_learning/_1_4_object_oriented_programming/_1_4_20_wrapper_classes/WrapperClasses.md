# Wrapper Classes

In Java, wrapper classes are used to convert primitive data types into objects. These classes are part of the `java.lang` package and provide a way to use primitive types as objects.

## List of Wrapper Classes

| Primitive Type | Wrapper Class |
|----------------|---------------|
| `byte`         | `Byte`        |
| `short`        | `Short`       |
| `int`          | `Integer`     |
| `long`         | `Long`        |
| `float`        | `Float`       |
| `double`       | `Double`      |
| `boolean`      | `Boolean`     |
| `char`         | `Character`   |

## Key Features of Wrapper Classes

- **Conversion between primitive types and objects**: Each wrapper class provides methods to convert between primitive types and their corresponding wrapper objects.
- **Immutability**: Wrapper class objects are immutable, meaning their values cannot be changed once they are created.
- **Utility methods**: Wrapper classes provide various utility methods, such as `parseXxx` methods for converting strings to primitive types (`Integer.parseInt()`, `Boolean.parseBoolean()`, etc.).
- **Support for `null`**: Wrapper objects can store `null` values, which primitive types cannot.

## Autoboxing and Unboxing

- **Autoboxing**: Automatic conversion of a primitive type to its corresponding wrapper class. Example:

```java
int primitiveData = 10;
Integer wrapperClass = x; // Autoboxing
```