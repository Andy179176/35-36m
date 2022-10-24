public class Ticket {
    private Route route;
    private MyDateTime time;
    private double price;

    public Ticket(Route route, MyDateTime time, double price) {
        this.route = route;
        this.time = time;
        this.price = price;
    }

    @Override
    public String toString() {
        return route + " "+time + " - " + price +"$";
    }

    public void changeTime(MyDateTime newDateTime){
        this.time=newDateTime;
    }
    public void changeTime(int day, int month, int year, int hour, int min){
        changeTime(new MyDateTime(day, month, year, hour, min));
    }

}
