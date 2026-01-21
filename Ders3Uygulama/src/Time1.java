

public class Time1 {
    private int hour; //0-23 aralığında olmalı
    private int minute; //0-59
    private int second; //0-59

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 ||
                second < 0 || second >= 60) {
            throw new IllegalArgumentException(
                    "hour, minute and/or second was out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toUniversalString() { // evrensel formatta bir saat gösterimi sunar.
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }


    public String toString() { // 12lik dilimde sonuçları verir.
        return String.format("%d:%02d:%02d %s",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),//ternary operatörü kullanıldı kendisi if-else gibi koşul operatörüdür.
                minute, second, (hour < 12 ? "AM" : "PM"));
    }

}
