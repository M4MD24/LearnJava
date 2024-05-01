[//]: # (Notes)

# 21 Law of the Most Important Arithmetic Laws

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

### Is Belong to Circle

```java
private static boolean isBelongToCircle(final int FIRST_POINT, final int SECOND_POINT) {
    final long FIRST_DISTANCE = (long) (FIRST_CENTER_POINT - FIRST_POINT) * (FIRST_CENTER_POINT - FIRST_POINT),
            SECOND_DISTANCE = (long) (SECOND_CENTER_POINT - SECOND_POINT) * (SECOND_CENTER_POINT - SECOND_POINT);
    return (DISTANCE_X + DISTANCE_Y <= (long) RADIUS * RADIUS);
}
```

### Is Straight Line

```java
private static boolean isStraightLine() {
    long FIRST_LINE = (long) (THIRD_NUMBER_SECOND_LINE - SECOND_NUMBER_SECOND_LINE) * (SECOND_NUMBER_FIRST_LINE - FIRST_NUMBER_FIRST_LINE),
            SECOND_LINE = (long) (SECOND_NUMBER_SECOND_LINE - FIRST_NUMBER_SECOND_LINE) * (THIRD_NUMBER_FIRST_LINE - SECOND_NUMBER_FIRST_LINE);
    return FIRST_LINE == SECOND_LINE;
}
```

### Is Parallel

```java
private static boolean isParallel() {
    final short FIRST_DELTA_FIRST_LINE = (short) (SECOND_NUMBER_FIRST_LINE - FIRST_NUMBER_FIRST_LINE),
            FIRST_DELTA_SECOND_LINE = (short) (SECOND_NUMBER_SECOND_LINE - FIRST_NUMBER_SECOND_LINE),
            SECOND_DELTA_FIRST_LINE = (short) (FOURTH_NUMBER_FIRST_LINE - THIRD_NUMBER_FIRST_LINE),
            SECOND_DELTA_SECOND_LINE = (short) (FOURTH_NUMBER_SECOND_LINE - THIRD_NUMBER_SECOND_LINE);
    return FIRST_DELTA_FIRST_LINE * SECOND_DELTA_SECOND_LINE == SECOND_DELTA_FIRST_LINE * FIRST_DELTA_SECOND_LINE;
}
```

### Is Circles Intersect

```java
private static boolean isCirclesIntersect() {
    final double FIRST_MIDDLE_POINT_FIRST_CIRCLE = (FIRST_POINT_FIRST_CIRCLE + SECOND_POINT_FIRST_CIRCLE) / 2D,
            FIRST_MIDDLE_POINT_SECOND_CIRCLE = (FIRST_POINT_SECOND_LINE + SECOND_POINT_SECOND_LINE) / 2D,
            SECOND_MIDDLE_POINT_FIRST_CIRCLE = (THIRD_POINT_FIRST_CIRCLE + FOURTH_POINT_FIRST_CIRCLE) / 2D,
            SECOND_MIDDLE_POINT_SECOND_CIRCLE = (THIRD_POINT_SECOND_LINE + FOURTH_POINT_SECOND_LINE) / 2D,
            RADIUS_FIRST_CIRCLE = Math.sqrt(Math.pow(FIRST_POINT_FIRST_CIRCLE - SECOND_POINT_FIRST_CIRCLE, 2) +
                    Math.pow(FIRST_POINT_SECOND_LINE - SECOND_POINT_SECOND_LINE, 2)) / 2,
            RADIUS_SECOND_CIRCLE = Math.sqrt(Math.pow(THIRD_POINT_FIRST_CIRCLE - FOURTH_POINT_FIRST_CIRCLE, 2)
                    + Math.pow(THIRD_POINT_SECOND_LINE - FOURTH_POINT_SECOND_LINE, 2)) / 2,
            DISTANCE = Math.sqrt(Math.pow(FIRST_MIDDLE_POINT_FIRST_CIRCLE - SECOND_MIDDLE_POINT_FIRST_CIRCLE, 2) +
                    Math.pow(FIRST_MIDDLE_POINT_SECOND_CIRCLE - SECOND_MIDDLE_POINT_SECOND_CIRCLE, 2)),
            SUM_OF_RADIUS = RADIUS_FIRST_CIRCLE + RADIUS_SECOND_CIRCLE;
    return (DISTANCE > SUM_OF_RADIUS);
}
```

### Is Belong to Rectangle

```java
private static boolean isBelongToRectangle(final int FIRST_POINT, final int SECOND_POINT) {
    final int MINIMUM_POINT_NUMBER_FIRST_CIRCLE = Math.min(Math.min(FIRST_POINT_FIRST_CIRCLE, SECOND_POINT_FIRST_CIRCLE), Math.min(THIRD_POINT_FIRST_CIRCLE, FOURTH_POINT_FIRST_CIRCLE)),
            MAXIMUM_POINT_NUMBER_FIRST_CIRCLE = Math.max(Math.max(FIRST_POINT_FIRST_CIRCLE, SECOND_POINT_FIRST_CIRCLE), Math.max(THIRD_POINT_FIRST_CIRCLE, FOURTH_POINT_FIRST_CIRCLE)),
            MINIMUM_POINT_NUMBER_SECOND_CIRCLE = Math.min(Math.min(FIRST_POINT_SECOND_LINE, SECOND_POINT_SECOND_LINE), Math.min(THIRD_POINT_SECOND_LINE, FOURTH_POINT_SECOND_LINE)),
            MAXIMUM_POINT_NUMBER_SECOND_CIRCLE = Math.max(Math.max(FIRST_POINT_SECOND_LINE, SECOND_POINT_SECOND_LINE), Math.max(THIRD_POINT_SECOND_LINE, FOURTH_POINT_SECOND_LINE));
    return (FIRST_POINT >= MINIMUM_POINT_NUMBER_FIRST_CIRCLE && FIRST_POINT <= MAXIMUM_POINT_NUMBER_FIRST_CIRCLE &&
            SECOND_POINT >= MINIMUM_POINT_NUMBER_SECOND_CIRCLE && SECOND_POINT <= MAXIMUM_POINT_NUMBER_SECOND_CIRCLE);
}
```

### Get Subset of Number

```java
private static int getSubsetOfNumber(final int NUMBER) {
    return (NUMBER * (NUMBER + 1) / 2) * (1 << (NUMBER - 1));
}
```

### All Sides Are Right Triangle

```java
private static boolean allSidesAreRightTriangle(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
    return Math.pow(FIRST_SIDE, 2) + Math.pow(SECOND_SIDE, 2) == Math.pow(THIRD_SIDE, 2) ||
            Math.pow(SECOND_SIDE, 2) + Math.pow(THIRD_SIDE, 2) == Math.pow(FIRST_SIDE, 2) ||
            Math.pow(THIRD_SIDE, 2) + Math.pow(FIRST_SIDE, 2) == Math.pow(SECOND_SIDE, 2);
}
```

### Get Point Position Status

```java
private static boolean getPointPositionStatus() {
    final double AREA_TOTAL = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
            LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
            LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
            FIRST_AREA = getTriangleArea(FIRST_POINT, SECOND_POINT, LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
                    LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
            SECOND_AREA = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
                    FIRST_POINT, SECOND_POINT, LATITUDE_COORDINATES_THIRD_POINT, LONGITUDE_COORDINATES_THIRD_POINT),
            THIRD_AREA = getTriangleArea(LATITUDE_COORDINATES_FIRST_POINT, LONGITUDE_COORDINATES_FIRST_POINT,
                    LATITUDE_COORDINATES_SECOND_POINT, LONGITUDE_COORDINATES_SECOND_POINT,
                    FIRST_POINT, SECOND_POINT);
    return AREA_TOTAL == FIRST_AREA + SECOND_AREA + THIRD_AREA;
}

private static double getTriangleArea(final int LATITUDE_COORDINATES_FIRST_POINT, final int LONGITUDE_COORDINATES_FIRST_POINT, final int LATITUDE_COORDINATES_SECOND_POINT, final int LONGITUDE_COORDINATES_SECOND_POINT, final int LATITUDE_COORDINATES_THIRD_POINT, final int LONGITUDE_COORDINATES_THIRD_POINT) {
    return Math.abs((LATITUDE_COORDINATES_FIRST_POINT * (LONGITUDE_COORDINATES_SECOND_POINT - LONGITUDE_COORDINATES_THIRD_POINT) + LATITUDE_COORDINATES_SECOND_POINT * (LONGITUDE_COORDINATES_THIRD_POINT - LONGITUDE_COORDINATES_FIRST_POINT) + LATITUDE_COORDINATES_THIRD_POINT * (LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_SECOND_POINT)) / 2.0);
}
```

### Are Two Lines Parallel with Four Points

```java
private static boolean areTwoLinesParallelWithFourPoints(final double FIRST_POINT_FIRST_LINE,
                                                         final double SECOND_POINT_FIRST_LINE,
                                                         final double FIRST_POINT_SECOND_LINE,
                                                         final double SECOND_POINT_SECOND_LINE,
                                                         final double FIRST_POINT_THIRD_LINE,
                                                         final double SECOND_POINT_THIRD_LINE,
                                                         final double FIRST_POINT_FOURTH_LINE,
                                                         final double SECOND_POINT_FOURTH_LINE) {
    final double FIRST_SLOPE = (SECOND_POINT_SECOND_LINE - SECOND_POINT_FIRST_LINE) / (FIRST_POINT_SECOND_LINE - FIRST_POINT_FIRST_LINE),
            SECOND_SLOPE = (SECOND_POINT_FOURTH_LINE - SECOND_POINT_THIRD_LINE) / (FIRST_POINT_FOURTH_LINE - FIRST_POINT_THIRD_LINE);
    return FIRST_SLOPE == SECOND_SLOPE;
}
```

### Get Overlap Status

```java
private static String getOverlapStatus(final int FIRST_CIRCLE_FIRST_CENTER, final int FIRST_CIRCLE_SECOND_CENTER, final int FIRST_CIRCLE_RADIUS, final int SECOND_CIRCLE_FIRST_CENTER, final int SECOND_CIRCLE_SECOND_CENTER, final int SECOND_CIRCLE_RADIUS) {
    final double DISTANCE = Math.sqrt((FIRST_CIRCLE_FIRST_CENTER - SECOND_CIRCLE_FIRST_CENTER) * (FIRST_CIRCLE_FIRST_CENTER - SECOND_CIRCLE_FIRST_CENTER) + (FIRST_CIRCLE_SECOND_CENTER - SECOND_CIRCLE_SECOND_CENTER) * (FIRST_CIRCLE_SECOND_CENTER - SECOND_CIRCLE_SECOND_CENTER));
    if (DISTANCE > FIRST_CIRCLE_RADIUS + SECOND_CIRCLE_RADIUS)
        return "Circumference of first circle and second circle intersect";
    else if (FIRST_CIRCLE_RADIUS > DISTANCE + SECOND_CIRCLE_RADIUS)
        return "Second circle is in first circle";
    else if (SECOND_CIRCLE_RADIUS > DISTANCE + FIRST_CIRCLE_RADIUS)
        return "First circle is in second circle";
    else
        return "First circle and second circle don't overlap";
}
```

### Get Polygon Status

```java
private static String getPolygonStatus(final double FIRST_SIDE, final double SECOND_SIDE, final double DIAGONAL) {
    if (isRectangle(FIRST_SIDE, SECOND_SIDE, DIAGONAL))
        return "This is a rectangle.";
    else if (isRhombus(FIRST_SIDE, SECOND_SIDE))
        return "This is a rhombus.";
    else
        return "This is neither a rectangle nor a rhombus.";
}

public static boolean isRectangle(final double FIRST_SIDE, final double SECOND_SIDE, final double DIAGONAL) {
    return DIAGONAL * DIAGONAL == FIRST_SIDE * FIRST_SIDE + SECOND_SIDE * SECOND_SIDE;
}

public static boolean isRhombus(final double FIRST_SIDE, final double SECOND_SIDE) {
    return FIRST_SIDE == SECOND_SIDE;
}
```

### Get Count of Regions

```java
private static int getCountOfRegions(final int COUNT_OF_STRAIGHT_LINES) {
    return (COUNT_OF_STRAIGHT_LINES * (COUNT_OF_STRAIGHT_LINES + 1) >> 1) + 1;
}
```

### Are Orthogonal

```java
    private static boolean areLinesOrthogonal(final double START_X1, final double START_Y1,
                                              final double END_X1, final double END_Y1,
                                              final double START_X2, final double START_Y2,
                                              final double END_X2, final double END_Y2) {
    final double VECTOR_1X = END_X1 - START_X1,
            VECTOR_1Y = END_Y1 - START_Y1,
            VECTOR_2X = END_X2 - START_X2,
            VECTOR_2Y = END_Y2 - START_Y2,
            DOT_PRODUCT = VECTOR_1X * VECTOR_2X + VECTOR_1Y * VECTOR_2Y;
    return DOT_PRODUCT == 0;
}
```