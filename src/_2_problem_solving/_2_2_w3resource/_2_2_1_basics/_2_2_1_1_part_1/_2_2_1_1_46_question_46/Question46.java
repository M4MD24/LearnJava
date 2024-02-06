package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_46_question_46;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.TimeZone;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to display system time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Current Date time: Tue Feb 16 2:20:20 GMT+02:00 2024</h2>
 */

public class Question46 {
    public static void main(String[] args) {
        LocalDate dateNow = LocalDate.now();

        char[] dayOfWeekChars = dateNow.getDayOfWeek().toString().toCharArray();
        StringBuilder day = new StringBuilder();

        char[] dayOfMonthChars = dateNow.getMonth().toString().toCharArray();
        StringBuilder month = new StringBuilder();

        for (int index = 0; index < 3; index++) {
            String dayLetter = (index == 0) ? String.valueOf(dayOfWeekChars[index]) : String.valueOf(dayOfWeekChars[index]).toLowerCase();
            String monthLetter = (index == 0) ? String.valueOf(dayOfMonthChars[index]) : String.valueOf(dayOfMonthChars[index]).toLowerCase();
            day.append(dayLetter);
            month.append(monthLetter);
        }

        int dayOfMonth = dateNow.getDayOfMonth();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setCalendar(Calendar.getInstance(TimeZone.getTimeZone("GMT+2")));
        String time = simpleDateFormat.format(System.currentTimeMillis());

        String timeZone = TimeZone.getTimeZone("GMT+2").getDisplayName();

        int dayOfYear = dateNow.getYear();

        System.out.printf("Current date time now: %s %s %d %s %s %d", day, month, dayOfMonth, time, timeZone, dayOfYear);
    }
}