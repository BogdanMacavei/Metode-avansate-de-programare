package Lab2.Lab2.src.UI;

import Lab2.Lab2.src.domain.Album;
import Lab2.Lab2.src.domain.Fan;
import Lab2.Lab2.src.repository.inMemoryRepo.AlbumRepo;
import Lab2.Lab2.src.repository.inMemoryRepo.FanRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class AlbumUI {
    private static final AlbumRepo albumRepo = new AlbumRepo();
    private static final Scanner scanner = new Scanner(System.in);

    private static final FanRepo fanRepo = new FanRepo();


    public static void main(String[] args) {
        AlbumUI albumUI = new AlbumUI();

        boolean running = true;

        while (running) {
            System.out.println("===================================");
            System.out.println("               Album               ");
            System.out.println("===================================");
            System.out.println("1. Creare Album");
            System.out.println("2. Toate Albumele");
            System.out.println("3. Actualizare Album");
            System.out.println("4. Sterge Album");
            System.out.println("5. Inapoi");
            System.out.print("Alegeti comanda: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    createAlbum();
                    break;
                case 2:
                    viewAllAlbums();
                    break;
                case 3:
                    updateAlbum();
                    break;
                case 4:
                    deleteAlbum();
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid");
            }
        }
    }

    private static void createAlbum() {
        System.out.print("Introduceti ID-ul Artistului: ");
        int artistId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Introduceti Titlul: ");
        String title = scanner.nextLine();

        System.out.print("Introduceti Data Lansarii (yyyy-MM-dd): ");
        String releaseDateStr = scanner.nextLine();
        LocalDate releaseDate = LocalDate.parse(releaseDateStr);

        Fan fan = new Fan(1, "John", "Doe", LocalDate.of(1990, 1, 1));
        Album createdAlbum = albumRepo.createAlbum(artistId, title, releaseDate, fan);
        System.out.println("Album creat cu ID: " + createdAlbum.getIdAlbum());
        fanRepo.notifyFans(createdAlbum);
    }

    private static void viewAllAlbums() {
        List<Album> albums = albumRepo.getAllAlbume();
        for (Album album : albums) {
            System.out.println(album);
        }
    }

    private static void updateAlbum() {
        System.out.print("Introduceti ID-ul Albumului pentru actualizare: ");
        int albumId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        Album existingAlbum = albumRepo.getAlbumById(albumId);
        if (existingAlbum == null) {
            System.out.println("Albumul nu a fost gasit.");
            return;
        }

        System.out.print("Introduceti ID-ul Artistului: ");
        int artistId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        System.out.print("Introduceti Titlul: ");
        String title = scanner.nextLine();

        System.out.print("Introduceti Data Lansarii (yyyy-MM-dd): ");
        String releaseDateStr = scanner.nextLine();
        LocalDate releaseDate = LocalDate.parse(releaseDateStr);

    }

    private static void deleteAlbum() {
        System.out.print("Introduceti ID-ul Albumului pentru al sterge: ");
        int albumId = scanner.nextInt();
        scanner.nextLine();  // Consume newline character

        albumRepo.removeAlbum(albumId);
        System.out.println("Album sters cu succes.");
    }

}

