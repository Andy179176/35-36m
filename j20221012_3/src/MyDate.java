public class MyDate {
    int day;
    int month;
    int year;

    public MyDate(int day, int month, int year){
        this.day=day;
        this.month=month;
        this.year=year;
    }


    public String toString(){
        return year+"-"+month+"-"+day;
    }

    public void  print(){
        System.out.println(toString());
    }
}
