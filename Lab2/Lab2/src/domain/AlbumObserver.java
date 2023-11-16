package Lab2.Lab2.src.domain;

import Lab2.Lab2.src.domain.Album;
import Lab2.Lab2.src.domain.Fan;

public interface AlbumObserver<T> {
    void albumAdded(Album album, Fan fan);
}
