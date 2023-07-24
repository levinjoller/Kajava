package org.leviosa.kata;

public class Slope {
    public static final String UNDEFINED = "undefined";

    public String slope(int[] points) {
        int deltaX = points[0] - points[2];
        int deltaY = points[1] - points[3];
        if (deltaX == 0) {
            return UNDEFINED;
        }
        return Integer.toString(deltaY / deltaX);
    }
}
