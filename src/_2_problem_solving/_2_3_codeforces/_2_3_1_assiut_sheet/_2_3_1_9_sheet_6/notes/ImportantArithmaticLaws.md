[//]: # (Notes)

# Important Arithmetic Laws

### Is Power of Two

```java
private static boolean isPowerOfTwo(final long TARGET_NUMBER) {
    return ((Math.log10(TARGET_NUMBER) / Math.log10(2)) % 1 == 0);
}
```

### Is Prime

```java
private static boolean isPrime(final long TARGET_NUMBER) {
    if (TARGET_NUMBER == 2) return true;
    if (TARGET_NUMBER <= 1 || TARGET_NUMBER % 2 == 0) return false;
    for (long index = 3; index * index <= TARGET_NUMBER; index += 2)
        if (TARGET_NUMBER % index == 0)
            return false;
    return true;
}
```

### Get Summation Range from 0 to Target Number

```java
private static long summationFromZero(final long TARGET_NUMBER) {
    return TARGET_NUMBER * (TARGET_NUMBER + 1) / 2;
}
```

### Get Summation of All Numbers Range from Minimum Number to Maximum Number (Inclusive)

```java
private static long summationOfAllFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
    return (long) ((MAXIMUM_NUMBER - MINIMUM_NUMBER) + 1) * (MINIMUM_NUMBER + MAXIMUM_NUMBER) / 2;
}
```

### Get Summation of Even Numbers Range from Minimum Number to Maximum Number (Inclusive)

```java
private static long summationOfEvenFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
    return summationOfEvenFromZeroToTargetNumber(MAXIMUM_NUMBER / 2) -
            summationOfEvenFromZeroToTargetNumber((MINIMUM_NUMBER - 1) / 2);
}

private static long summationOfEvenFromZeroToTargetNumber(final int TARGET_NUMBER) {
    return TARGET_NUMBER * (TARGET_NUMBER + 1L);
}
```

### Get Summation of Odd Numbers Range from Minimum Number to Maximum Number (Inclusive)

```java
private static long summationOfOddFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
    return summationOfOddFromZeroToTargetNumber(MAXIMUM_NUMBER) -
            summationOfOddFromZeroToTargetNumber(MINIMUM_NUMBER - 1);
}

private static long summationOfOddFromZeroToTargetNumber(final int TARGET_NUMBER) {
    return (long) ((TARGET_NUMBER + 1) / 2) * ((TARGET_NUMBER + 1) / 2);
}
```

### Get GCD (Greatest Common Divisor)

```java
public static long getGreaterCommonDivisor(long number1, long number2) {
    while (number2 != 0) {
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        number2 %= number1;
    }
    return number1;
}
```

### Get LCM (Least Common Multiple)

```java
public static long getLeastCommonMultiple(final long NUMBER_1, final long NUMBER_2) {
    return (NUMBER_1 / getGreatestCommonDivisor(NUMBER_1, NUMBER_2)) * NUMBER_2;
}

public static long getGreatestCommonDivisor(long number1, long number2) {
    while (number2 != 0) {
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
        number2 %= number1;
    }
    return number1;
}
```