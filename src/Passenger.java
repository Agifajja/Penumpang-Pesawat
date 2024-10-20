public class Passenger {
    String name;
    Passenger next;

    public Passenger(String name) {
        this.name = name;
        this.next = null;
    }

    public String getName() {
        return name;
    }

    public void setNext(Passenger next) {
        this.next = next;
    }

    public Passenger getNext() {
        return next;
    }
}
