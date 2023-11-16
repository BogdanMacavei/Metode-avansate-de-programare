package Lab2.Lab2.src.repository.inMemoryRepo;

import Lab2.Lab2.src.UI.FanUI;
import Lab2.Lab2.src.domain.AlbumObserver;
import Lab2.Lab2.src.domain.Album;
import Lab2.Lab2.src.domain.Fan;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FanRepo extends org.example.domain.Persoana implements AlbumObserver {
    private final List<Fan> fani = new ArrayList<>();
    private int nextIdFan = 1;

    //Singelton Pattern
    private static final FanRepo INSTANCE = new FanRepo();

    public FanRepo() {

    }

    public static FanRepo getInstance() {
        return INSTANCE;
    }

    public Fan createFan(String nume, String prenume, LocalDate dataNasterii) {
        Fan fan = new Fan(nextIdFan, nume, prenume, dataNasterii);
        fani.add(fan);
        nextIdFan++;

        AlbumRepo.getInstance().addObserver(fan);

        return fan;
    }

    public Fan getFanById(int id) {
        for (Fan f : fani) {
            if (f.getIdFan() == id) {
                return f;
            }
        }
        return null;
    }

    public List<Fan> getAllFani() {
        return this.fani;
    }

    public Fan updateFan(Fan fan) {
        for (Fan f : fani) {
            if (f.getIdFan() == fan.getIdFan()) {
                return fan;
            }
        }
        return null;
    }

    public void removeFan(int id) {
        Fan fan = getFanById(id);
        if (fan != null) {
            fani.remove(fan);
        }
    }

    @Override
    public void albumAdded(Album album, Fan fan) {
        System.out.println("Fan " + fan.getIdFan() + " notified about the new album: " + album);
    }

    public void notifyFans(Album album) {
        for (Fan fan : fani) {
            fan.albumAdded(album, fan);
        }
    }

}
