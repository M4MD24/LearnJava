package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_140;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to merge all overlapping intervals from a given collection of intervals.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1 6
 * <br/>
 * 8 10
 * <br/>
 * 15 20
 * </h2>
 */

class Interval {
    int start,
            end;
    Interval nextInterval;
}

class IntervalLinkedList {
    Interval head;

    public void addInterval(int start, int end) {
        Interval interval = new Interval();
        interval.start = start;
        interval.end = end;
        interval.nextInterval = null;
        if (head == null) head = interval;
        else {
            Interval anotherInterval = head;
            while (anotherInterval.nextInterval != null) anotherInterval = anotherInterval.nextInterval;
            anotherInterval.nextInterval = interval;
        }
    }

    public void showAll() {
        Interval interval = head;
        final String TO = ":";
        if (interval != null) {
            while (interval.nextInterval != null) {
                System.out.println(interval.start + TO + interval.end);
                interval = interval.nextInterval;
            }
            System.out.print(interval.start + TO + interval.end);
        } else System.out.print("Nothing to show!");
    }

    public void mergeAllOverlapping() {
        Interval interval = head;
        if (interval != null) {
            while (interval.nextInterval != null) {
                int start1 = interval.start,
                        end1 = interval.end,
                        start2 = interval.nextInterval.start,
                        end2 = interval.nextInterval.end;
                if (end1 >= start2) {
                    interval.start = Math.min(start1, start2);
                    interval.end = Math.max(end1, end2);
                    interval.nextInterval = interval.nextInterval.nextInterval;
                } else interval = interval.nextInterval;
            }
        }
    }
}

public class Question140 {
    private static final IntervalLinkedList interval = new IntervalLinkedList();

    public static void main(final String[] PARAMETERS) throws java.lang.Exception {
        addIntervals();
        displayAll();
    }

    private static void displayAll() {
        System.out.println("All Intervals:");
        interval.showAll();
        System.out.println("\n\nAfter merge Intervals:");
        interval.mergeAllOverlapping();
        interval.showAll();
    }

    private static void addIntervals() {
        interval.addInterval(1, 3);
        interval.addInterval(2, 6);
        interval.addInterval(8, 10);
        interval.addInterval(15, 18);
        interval.addInterval(17, 20);
    }
}