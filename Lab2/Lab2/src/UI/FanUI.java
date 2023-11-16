package Lab2.Lab2.src.UI;

import Lab2.Lab2.src.domain.Album;
import Lab2.Lab2.src.domain.AlbumObserver;
import Lab2.Lab2.src.domain.Fan;
import Lab2.Lab2.src.repository.inMemoryRepo.AlbumRepo;
import Lab2.Lab2.src.repository.inMemoryRepo.FanRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class FanUI implements AlbumObserver {
    private static final FanRepo fanRepo = new FanRepo();
    private static final AlbumRepo albumRepo = AlbumRepo.getInstance();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        boolean running = true;

        // Add the FanUI as an observer
        albumRepo.addObserver(new FanUI());

        while (running) {
            System.out.println("===================================");
            System.out.println("             Fan Base              ");
            System.out.println("===================================");
            System.out.println("1. Creare Fan");
            System.out.println("2. Toti Fani");
            System.out.println("3. Actualizare Fan");
            System.out.println("4. Sterge Fan");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    createFan();
                    break;
                case 2:
                    viewAllFans();
                    break;
                case 3:
                    updateFan();
                    break;
                case 4:
                    deleteFan();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private static void createFan() {
        System.out.print("Nume: ");
        String firstName = scanner.nextLine();

        System.out.print("Prenume: ");
        String lastName = scanner.nextLine();

        System.out.print("Data nasterii (yyyy-MM-dd): ");
        String dateOfBirthStr = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        Fan fanCreated = fanRepo.createFan(firstName, lastName, dateOfBirth);
        System.out.println("Fan creat cu ID: " + fanCreated.getIdFan());
    }

    private static void viewAllFans() {
        List<Fan> fans = fanRepo.getAllFani();
        for (Fan fan : fans) {
            System.out.println(fan);
        }
    }

    private static void updateFan() {
        System.out.print("Introduceti ID-ul Fanului pentru a fi adaugat: ");
        int fanId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Fan existingFan = fanRepo.getFanById(fanId);
        if (existingFan == null) {
            System.out.println("Fanul nu a fost gasit.");
            return;
        }

        System.out.print("Nume nou: ");
        String firstName = scanner.nextLine();

        System.out.print("Prenume nou: ");
        String lastName = scanner.nextLine();

        System.out.print("Noua Data de nastere (yyyy-MM-dd): ");
        String dateOfBirthStr = scanner.nextLine();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthStr);

        Fan updatedFan = new Fan(fanId, firstName, lastName, dateOfBirth);
        fanRepo.updateFan(updatedFan);
        System.out.println("Fan actualizat cu succes.");
    }

    private static void deleteFan() {
        System.out.print("Introduceti ID-ul Fanului pentru a fi sters: ");
        int fanId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        fanRepo.removeFan(fanId);
        System.out.println("Fan sters cu succes.");
    }

    public void albumAdded(Album album, Fan fan) {
        // Handle the album added event in FanUI
        if (album != null) {
            System.out.println("Fan notified about the new album: " + album);
        }
    }
}
