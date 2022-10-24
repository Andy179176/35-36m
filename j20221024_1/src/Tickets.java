public class Tickets {
    private int size;
    private  int capacity;
     private Ticket[] ticketsArray;

    public Tickets(int capacity) {
        this.capacity =capacity;
        ticketsArray = new Ticket[capacity];
        size =0;
    }

    public boolean add(Ticket ticket){
        if(size<ticketsArray.length){
            ticketsArray[size]=ticket;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        String res="";
        for (int i=0; i<ticketsArray.length && i<size;i++){
            res+=ticketsArray[i]+System.lineSeparator();
        }
        res+="---------------"+System.lineSeparator()+ "Total: "+ size +" tickets";
        return res;
    }

    public Ticket get(int index){
        if (index<size) {
            return ticketsArray[index];
        } else {
            return null;
        }
    }

}
