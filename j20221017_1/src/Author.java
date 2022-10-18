public class Author {
    String fName;
    String lName;
    MyDate birthday;

    public Author(String fName, String lName, MyDate birthday) {
        this.fName = fName;
        this.lName = lName;
        this.birthday = birthday;
    }

    public String toString(){
        return  fName.charAt(0) + "."+ lName + "("+ birthday.toString()+ ")";
    }
}
