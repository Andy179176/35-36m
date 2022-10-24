public class MyDateTime {
    private int day;
    private int month;
    private int year;
    private int hour;
    private int min;

    public MyDateTime(int day, int month, int year, int hour, int min) {
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.min = min;
    }

    @Override
    public String toString() {
        return day +"-"+month +"-"+year +"  "+hour +":"+ min;
    }
}
