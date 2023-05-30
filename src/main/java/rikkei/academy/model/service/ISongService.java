package rikkei.academy.model.service;


import rikkei.academy.model.entity.Song;

import java.util.List;

public interface ISongService{
    List<Song> findAll();
    void save(Song song);
}
