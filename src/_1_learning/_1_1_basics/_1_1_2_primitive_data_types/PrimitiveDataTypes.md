# Primitive Data Types

In Java, there are **eight primitive data types**. These types are predefined by the language and named by a keyword. Here’s a breakdown of each:

1. **byte**  
   - **Size**: 8 bits (1 byte)
   - **Range**: -128 to 127
   - **Default value**: 0
   - **Usage**: Useful for saving memory in large arrays.

2. **short**  
   - **Size**: 16 bits (2 bytes)
   - **Range**: -32,768 to 32,767
   - **Default value**: 0
   - **Usage**: Similar to `byte`, but can hold larger values.

3. **int**  
   - **Size**: 32 bits (4 bytes)
   - **Range**: -2^31 to 2^31-1
   - **Default value**: 0
   - **Usage**: Commonly used for integers in general arithmetic.

4. **long**  
   - **Size**: 64 bits (8 bytes)
   - **Range**: -2^63 to 2^63-1
   - **Default value**: 0L
   - **Usage**: When a wider range than `int` is needed. Add an 'L' or 'l' suffix to the literal.

5. **float**  
   - **Size**: 32 bits (4 bytes)
   - **Range**: 6-7 decimal digits precision
   - **Default value**: 0.0f
   - **Usage**: Single-precision floating-point numbers. Add an 'f' or 'F' suffix to the literal.

6. **double**  
   - **Size**: 64 bits (8 bytes)
   - **Range**: 15-16 decimal digits precision
   - **Default value**: 0.0d
   - **Usage**: Double-precision floating-point numbers. Add a 'd' or 'D' suffix to the literal.

7. **boolean**  
   - **Size**: 1 bit (true/false)
   - **Values**: `true` or `false`
   - **Default value**: `false`
   - **Usage**: Used for simple flags that track true/false conditions.

8. **char**  
   - **Size**: 16 bits (2 bytes)
   - **Range**: 0 to 65,535 (Unicode character set)
   - **Default value**: '\u0000' (null character)
   - **Usage**: Stores single characters like 'a', 'B', '1', etc.
