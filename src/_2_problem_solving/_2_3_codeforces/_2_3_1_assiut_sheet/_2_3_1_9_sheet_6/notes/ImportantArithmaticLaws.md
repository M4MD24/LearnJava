[//]: # (Notes)

# Important Arithmetic Laws

### Is Power of Two

```java
private static String isPowerOfTwo(final long TARGET_NUMBER) {
    return ((Math.log10(TARGET_NUMBER) / Math.log10(2)) % 1 == 0) ? "YES" : "NO";
}
```

### Is Prime

```java
private static String isPrime(final long TARGET_NUMBER) {
    if (TARGET_NUMBER == 2) return "YES";
    if (TARGET_NUMBER <= 1 || TARGET_NUMBER % 2 == 0) return "NO";
    for (long index = 3; index * index <= TARGET_NUMBER; index += 2)
        if (TARGET_NUMBER % index == 0)
            return "NO";
    return "YES";
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