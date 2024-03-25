[//]: # (Notes)

# Important Arithmetic Laws

### Is Power of Two

```java
private static boolean isPowerOfTwo(final long TARGET_NUMBER) {
    return ((Math.log10(TARGET_NUMBER) / Math.log10(2)) % 1 == 0);
}
```

### Get Summation Range from 1 to Target Number (Inclusive)

```java
private static long summationFromOneToTargetNumberInclusive(final long TARGET_NUMBER) {
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

### Get Summation of All Numbers From Minimum Number To Maximum Number Inclusive are Divisible by Target Number

```java
private static long summationOfAllNumbersFromMinimumNumberToMaximumNumberInclusiveAreDivisibleByTargetNumber(final long MINIMUM_NUMBER, final long MAXIMUM_NUMBER, final long TARGET_NUMBER) {
    return (summationFromOneToTargetNumberInclusive(MAXIMUM_NUMBER / TARGET_NUMBER) * TARGET_NUMBER) - (summationFromOneToTargetNumberInclusive((MINIMUM_NUMBER - 1) / TARGET_NUMBER) * TARGET_NUMBER);
}

private static long summationFromOneToTargetNumberInclusive(final long TARGET_NUMBER) {
    return TARGET_NUMBER * (TARGET_NUMBER + 1) / 2;
}
```

### Get Distance Points

```java
final double LATITUDE = LATITUDE_NUMBER_1 - LATITUDE_NUMBER_2,
        LONGITUDE = LONGITUDE_NUMBER_1 - LONGITUDE_NUMBER_2;
final double DISTANCE_POINTS = Math.sqrt((LATITUDE * LATITUDE) + (LONGITUDE * LONGITUDE));
```

### Get Equation Triangle Area

```java
private static double equilateralTriangleArea(final short SUMMATION) {
    return Math.sqrt(((double) SUMMATION / 2) * ((double) SUMMATION / 2 - FIRST_SIDE_LENGTH) * ((double) SUMMATION / 2 - SECOND_SIDE_LENGTH) * ((double) SUMMATION / 2 - THIRD_SIDE_LENGTH));
}
```