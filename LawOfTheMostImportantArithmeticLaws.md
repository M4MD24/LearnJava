[//]: # (Notes)

# 52 Law of the Most Important Arithmetic Laws

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

private static boolean isRectangle(final double FIRST_SIDE, final double SECOND_SIDE, final double DIAGONAL) {
    return DIAGONAL * DIAGONAL == FIRST_SIDE * FIRST_SIDE + SECOND_SIDE * SECOND_SIDE;
}

private static boolean isRhombus(final double FIRST_SIDE, final double SECOND_SIDE) {
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

### Is Triangle

```java
private static boolean isTriangle(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
    return (FIRST_SIDE + SECOND_SIDE > THIRD_SIDE) &&
            (SECOND_SIDE + THIRD_SIDE > FIRST_SIDE) &&
            (FIRST_SIDE + THIRD_SIDE > SECOND_SIDE);
}
```

### Get Triangle Area

```java
private static double getTriangleArea(final int FIRST_SIDE, final int SECOND_SIDE, final int THIRD_SIDE) {
    final double SEMI_PERIMETER = (double) (FIRST_SIDE + SECOND_SIDE + THIRD_SIDE) / 2;
    return Math.sqrt(SEMI_PERIMETER * (SEMI_PERIMETER - FIRST_SIDE) * (SEMI_PERIMETER - SECOND_SIDE) * (SEMI_PERIMETER - THIRD_SIDE));
}
```

### Is Leap Year

```java
private static boolean isLeapYear(final int YEAR) {
    return (YEAR % 4 == 0 && YEAR % 100 != 0) || YEAR % 400 == 0;
}
```

### Get Future Investment Value

```java
private static double getFutureInvestmentValue(final double INVESTMENT_AMOUNT, final double MONTHLY_INTEREST_RATE, final int CURRENT_YEAR) {
    return INVESTMENT_AMOUNT * Math.pow(1 + MONTHLY_INTEREST_RATE, CURRENT_YEAR * 12);
}
```

### Get Pentagonal Number

```java
private static int getPentagonalNumber(final int NUMBER) {
    return NUMBER * (3 * NUMBER - 1) / 2;
}
```

### Get Average Numbers

```java
private static int getAverageNumbers(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
    return (FIRST_NUMBER + SECOND_NUMBER + THIRD_NUMBER) / 3;
}
```

### Get Pentagon Area

```java
private static double getPentagonArea(final double SIDE) {
    return (5 * SIDE * SIDE) / (4 * Math.tan(Math.PI / 5));
}
```

### Are Three Numbers Consecutive

```java
private static boolean areThreeNumbersConsecutive(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
    return (SECOND_NUMBER - FIRST_NUMBER) == (THIRD_NUMBER - SECOND_NUMBER);
}
```

### Is Mid-Point

```java
private static boolean isMidPoint(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
    return (FIRST_NUMBER == SECOND_NUMBER) && (SECOND_NUMBER == THIRD_NUMBER) ||
            (THIRD_NUMBER - SECOND_NUMBER) == (SECOND_NUMBER - FIRST_NUMBER) ||
            (SECOND_NUMBER - THIRD_NUMBER) == (THIRD_NUMBER - FIRST_NUMBER) ||
            (SECOND_NUMBER - FIRST_NUMBER) == (FIRST_NUMBER - THIRD_NUMBER) ||
            (FIRST_NUMBER - SECOND_NUMBER) == (SECOND_NUMBER - THIRD_NUMBER);
}
```

### Get Celsius Degree

```java
private static int getCelsiusDegree(final int FAHRENHEIT_DEGREE) {
    return (5 * (FAHRENHEIT_DEGREE - 32)) / 9;
}
```

### Get Body Mass Index with Pounds and Inches

```java
private static double getBodyMassIndexWithPoundsAndInches(final double POUNDS, final double INCHES) {
    return POUNDS * 0.45359237 / (Math.pow(INCHES * 0.0254, 2));
}
```

### Is Finite Status

```java
private static boolean isFiniteStatus(final double NUMBER) {
    return Double.isFinite(NUMBER);
}
```

### Is Same Up to Two Decimal Places

```java
private static boolean isSameUpToTwoDecimalPlaces() {
    return Math.abs(FIRST_NUMBER - SECOND_NUMBER) <= 0.01;
}
```

### Get Binomial Coefficient

```java
private static long getBinomialCoefficient(final byte FIRST_NUMBER, final byte SECOND_NUMBER) {
    return getFactorial(FIRST_NUMBER) / (getFactorial(SECOND_NUMBER) * getFactorial((byte) (FIRST_NUMBER - SECOND_NUMBER)));
}

private static long getFactorial(final byte NUMBER) {
    long multiplication = 1;
    for (int index = 2; index <= NUMBER; index++)
        multiplication *= index;
    return multiplication;
}
```

### Is Perfect Square

```java
private static boolean isPerfectSquare(final int NUMBER) {
    return Math.sqrt(NUMBER) * Math.sqrt(NUMBER) == NUMBER;
}
```

### Is Fibonacci

```java
private static boolean isFibonacci(final int NUMBER) {
    return isPerfectSquare(5 * NUMBER * NUMBER + 4) || isPerfectSquare(5 * NUMBER * NUMBER - 4);
}

private static boolean isPerfectSquare(final int NUMBER) {
    return Math.sqrt(NUMBER) * Math.sqrt(NUMBER) == NUMBER;
}
```

### Get Divisor Sum

```java
private static long getDivisorSum(final int NUMBER) {
    return LongStream.rangeClosed(1, (NUMBER + 1) / 2).filter(number -> NUMBER % number == 0 && NUMBER != number).sum();
}
```

### Is Automorphic Number

```java
private static boolean isAutomorphicNumber(final int NUMBER) {
    final int NUMBER_SQUARE = NUMBER * NUMBER;
    return String.valueOf(NUMBER_SQUARE).contains(String.valueOf(NUMBER));
}
```

### Is Duck Number

```java
private static boolean isDuckNumber(final int NUMBER) {
    return String.valueOf(NUMBER).indexOf('0') != -1;
}
```

### Is Cube Number

```java
private static boolean isCubeNumber(final int NUMBER) {
    return Math.cbrt(NUMBER) % 1 == 0;
}
```

### Is Palindrome Number

```java
private static boolean isPalindromeNumber(final int NUMBER) {
    return String.valueOf(NUMBER).contentEquals(new StringBuilder(String.valueOf(NUMBER)).reverse());
}
```

### Get Rectangle Area

```java
private static double getRectangleArea(final double WIDTH, final double LENGTH) {
    return WIDTH * LENGTH;
}
```

### Get Perimeter of Parallelogram

```java
private static double perimeterOfParallelogram(final double BASE_VALUE, final double SIDE_LENGTH) {
    return 2 * (BASE_VALUE + LENGTH);
}
```

### Get Perimeter of Rhombus

```java
private static double perimeterOfRhombus(final double LENGTH) {
    return LENGTH * 4;
}
```

### Get Area of Rhombus

```java
private static double areaOfRhombus(final double FIRST_DIAGONAL, final double SECOND_DIAGONAL) {
    return FIRST_DIAGONAL * SECOND_DIAGONAL / 2;
}
```

### Get Area of Parallelogram

```java
private static double areaOfParallelogram(final double HEIGHT, final double BASE_LENGTH) {
    return HEIGHT * BASE_LENGTH;
}
```

### Get Cone Volume

```java
private static double coneVolume(final double RADIUS, final double HEIGHT) {
    return (1.0 / 3) *
            HEIGHT *
            Math.PI *
            RADIUS *
            RADIUS;
}
```

### Get Radius of Circle

```java
private static double getRadiusOfCircle(final double CIRCUMFERENCE) {
    return CIRCUMFERENCE / (2 * Math.PI);
}
```

### Get Circumference of Circle

```java
private static double getCircumferenceOfCircle(final double RADIUS) {
    return 2 * Math.PI * RADIUS;
}
```

### Get Area of Circle

```java
private static double getAreaOfCircle(final double RADIUS) {
    return Math.PI * RADIUS * RADIUS;
}
```

### Get Factorial Trailing Zeroes

```java
private static int trailingZeroes(final int NUMBER) {
    return NUMBER == 0
            ? 0
            : NUMBER / 5 + trailingZeroes(NUMBER / 5);
}
```