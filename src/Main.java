import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah penumpang");
            System.out.println("2. Hapus penumpang");
            System.out.println("3. Tampilkan daftar penumpang");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Mengambil newline yang tersisa

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama penumpang: ");
                    String nameToAdd = scanner.nextLine();
                    flight.addPassenger(nameToAdd);
                    break;

                case 2:
                    System.out.print("Masukkan nama penumpang yang akan dihapus: ");
                    String nameToRemove = scanner.nextLine();
                    flight.removePassenger(nameToRemove);
                    break;

                case 3:
                    System.out.println("Daftar penumpang:");
                    flight.displayPassengers();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

