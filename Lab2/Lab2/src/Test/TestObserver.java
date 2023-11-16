package Lab2.Lab2.src.Test;

import Lab2.Lab2.src.UI.FanUI;
import Lab2.Lab2.src.domain.Album;
import Lab2.Lab2.src.domain.Fan;
import Lab2.Lab2.src.repository.inMemoryRepo.AlbumRepo;

import java.time.LocalDate;

public class TestObserver {
    public static void main(String[] args) {
        // Create instances
        AlbumRepo albumRepo = AlbumRepo.getInstance();

        // Pre-built Fan
        Fan preBuiltFan = new Fan(1, "John", "Doe", LocalDate.of(1990, 1, 1));

        // Add the pre-built fan as an observer to the albumRepo
        albumRepo.addObserver(preBuiltFan);

        // Create a new album, and the fan should be notified
        Album newAlbum = albumRepo.createAlbum(1, "Test Album", LocalDate.now(), preBuiltFan);

        // Optionally, you can print the created album
        System.out.println("Created Album: " + newAlbum);
    }
}
