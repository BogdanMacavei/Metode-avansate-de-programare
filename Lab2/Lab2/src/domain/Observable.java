package Lab2.Lab2.src.domain;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable<T> {
    private final List<AlbumObserver<T>> observers = new ArrayList<>();

    public void addObserver(AlbumObserver<T> observer) {
        observers.add(observer);
    }

    public void removeObserver(AlbumObserver<T> observer) {
        observers.remove(observer);
    }

    protected void notifyObservers(Album data, Fan fan) {
        for (AlbumObserver<T> observer : observers) {
            observer.albumAdded(data, fan);
        }
    }
}


