
public class Time1Test {
    public static void main(String[] args) {
        Time1 time = new Time1();

        displayTime("After time object is created", time);
        System.out.println();

        time.setTime(13,27,6);
        diplayTime("After calling setTime", time);
        System.out.println();



    }



}