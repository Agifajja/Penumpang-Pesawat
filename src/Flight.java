public class Flight {
    private Passenger head;

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger;
        } else {
            Passenger current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPassenger;
        }
        System.out.println(name + " telah ditambahkan ke penerbangan.");
    }

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Tidak ada penumpang untuk dihapus.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            System.out.println(name + " telah dihapus dari penerbangan.");
            return;
        }

        Passenger current = head;
        Passenger previous = null;

        while (current != null && !current.name.equals(name)) {
            previous = current;
            current = current.next;
        }

        if (current != null) {
            previous.next = current.next;
            System.out.println(name + " telah dihapus dari penerbangan.");
        } else {
            System.out.println(name + " tidak ditemukan.");
        }
    }

    public void displayPassengers() {
        if (head == null) {
            System.out.println("Tidak ada penumpang di penerbangan.");
            return;
        }

        Passenger current = head;
        while (current != null) {
            System.out.println("Penumpang: " + current.name);
            current = current.next;
        }
    }
}
