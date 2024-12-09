package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_z_triangle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * <h1>Z. Triangle</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>At a geometry lesson Bob learnt that a triangle is called right-angled if it is nondegenerate and one of its angles is right. Bob decided to draw such a triangle immediately: on a sheet of paper he drew three points with integer coordinates, and joined them with segments of straight lines, then he showed the triangle to Peter. Peter said that Bob's triangle is not right-angled, but is almost right-angled: the triangle itself is not right-angled, but it is possible to move one of the points exactly by distance 1 so, that all the coordinates remain integer, and the triangle become right-angled. Bob asks you to help him and find out if Peter tricks him. By the given coordinates of the triangle you should find out if it is right-angled, almost right-angled, or neither of these.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>0 0 2 0 0 1</h2>
 * <h1>Output:</h1>
 * <h2>RIGHT</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 3 4 5 6 6</h2>
 * <h1>Output:</h1>
 * <h2>NEITHER</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>-1 0 2 0 0 1</h2>
 * <h1>Output:</h1>
 * <h2>ALMOST</h2>
 */

public class TriangleExample {
    private static short latitudeCoordinatesFirstPoint,
            longitudeCoordinatesFirstPoint,
            latitudeCoordinatesSecondPoint,
            longitudeCoordinatesSecondPoint,
            latitudeCoordinatesThirdPoint,
            longitudeCoordinatesThirdPoint;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputCoordinates();
        printIsRightAngled();
    }

    private static void inputCoordinates() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        latitudeCoordinatesFirstPoint = Short.parseShort(LINE.nextToken());
        longitudeCoordinatesFirstPoint = Short.parseShort(LINE.nextToken());
        latitudeCoordinatesSecondPoint = Short.parseShort(LINE.nextToken());
        longitudeCoordinatesSecondPoint = Short.parseShort(LINE.nextToken());
        latitudeCoordinatesThirdPoint = Short.parseShort(LINE.nextToken());
        longitudeCoordinatesThirdPoint = Short.parseShort(LINE.nextToken());
    }

    private static void printIsRightAngled() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        if (isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint))
            OUTPUT.write("RIGHT");
        else if (isRightAngledOrNot((short) (latitudeCoordinatesFirstPoint + 1), longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint) || isRightAngledOrNot((short) (latitudeCoordinatesFirstPoint - 1), longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint)
                || isRightAngledOrNot(latitudeCoordinatesFirstPoint, (short) (longitudeCoordinatesFirstPoint + 1), latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint) || isRightAngledOrNot(latitudeCoordinatesFirstPoint, (short) (longitudeCoordinatesFirstPoint - 1), latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint)
                || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, (short) (latitudeCoordinatesSecondPoint + 1), longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint) || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, (short) (latitudeCoordinatesSecondPoint - 1), longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint)
                || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, (short) (longitudeCoordinatesSecondPoint + 1), latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint) || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, (short) (longitudeCoordinatesSecondPoint - 1), latitudeCoordinatesThirdPoint, longitudeCoordinatesThirdPoint)
                || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, (short) (latitudeCoordinatesThirdPoint + 1), longitudeCoordinatesThirdPoint) || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, (short) (latitudeCoordinatesThirdPoint - 1), longitudeCoordinatesThirdPoint)
                || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, (short) (longitudeCoordinatesThirdPoint + 1)) || isRightAngledOrNot(latitudeCoordinatesFirstPoint, longitudeCoordinatesFirstPoint, latitudeCoordinatesSecondPoint, longitudeCoordinatesSecondPoint, latitudeCoordinatesThirdPoint, (short) (longitudeCoordinatesThirdPoint - 1)))
            OUTPUT.write("ALMOST");
        else
            OUTPUT.write("NEITHER");
        OUTPUT.flush();
    }

    private static boolean isRightAngledOrNot(final short LATITUDE_COORDINATES_FIRST_POINT, final short LONGITUDE_COORDINATES_FIRST_POINT, final short LATITUDE_COORDINATES_SECOND_POINT, final short LONGITUDE_COORDINATES_SECOND_POINT, final short LATITUDE_COORDINATES_THIRD_POINT, final short LONGITUDE_COORDINATES_THIRD_POINT) {
        if ((LATITUDE_COORDINATES_FIRST_POINT == LATITUDE_COORDINATES_SECOND_POINT && LONGITUDE_COORDINATES_FIRST_POINT == LONGITUDE_COORDINATES_SECOND_POINT) || (LATITUDE_COORDINATES_FIRST_POINT == LATITUDE_COORDINATES_THIRD_POINT && LONGITUDE_COORDINATES_FIRST_POINT == LONGITUDE_COORDINATES_THIRD_POINT) || (LATITUDE_COORDINATES_SECOND_POINT == LATITUDE_COORDINATES_THIRD_POINT && LONGITUDE_COORDINATES_SECOND_POINT == LONGITUDE_COORDINATES_THIRD_POINT))
            return false;
        final short FIRST_EDGE_SQUARED = (short) (((LATITUDE_COORDINATES_FIRST_POINT - LATITUDE_COORDINATES_SECOND_POINT) * (LATITUDE_COORDINATES_FIRST_POINT - LATITUDE_COORDINATES_SECOND_POINT)) + ((LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_SECOND_POINT) * (LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_SECOND_POINT))),
                SECOND_EDGE_SQUARED = (short) (((LATITUDE_COORDINATES_FIRST_POINT - LATITUDE_COORDINATES_THIRD_POINT) * (LATITUDE_COORDINATES_FIRST_POINT - LATITUDE_COORDINATES_THIRD_POINT)) + ((LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_THIRD_POINT) * (LONGITUDE_COORDINATES_FIRST_POINT - LONGITUDE_COORDINATES_THIRD_POINT))),
                THIRD_EDGE_SQUARED = (short) (((LATITUDE_COORDINATES_SECOND_POINT - LATITUDE_COORDINATES_THIRD_POINT) * (LATITUDE_COORDINATES_SECOND_POINT - LATITUDE_COORDINATES_THIRD_POINT)) + ((LONGITUDE_COORDINATES_SECOND_POINT - LONGITUDE_COORDINATES_THIRD_POINT) * (LONGITUDE_COORDINATES_SECOND_POINT - LONGITUDE_COORDINATES_THIRD_POINT)));
        final short[] EDGES_SQUARED = {FIRST_EDGE_SQUARED, SECOND_EDGE_SQUARED, THIRD_EDGE_SQUARED};
        Arrays.sort(EDGES_SQUARED);
        final short SMALL_EDGE_SQUARED = (short) (EDGES_SQUARED[0] + EDGES_SQUARED[1]),
                LARGE_EDGE_SQUARED = EDGES_SQUARED[2];
        return SMALL_EDGE_SQUARED == LARGE_EDGE_SQUARED;
    }
}
