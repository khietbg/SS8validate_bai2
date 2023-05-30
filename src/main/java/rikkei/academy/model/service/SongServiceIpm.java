package rikkei.academy.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rikkei.academy.model.entity.Song;
import rikkei.academy.repository.SongRepository;

import java.util.List;
@Service
public class SongServiceIpm implements ISongService{
    @Autowired
    private SongRepository repository;
    @Override
    public List<Song> findAll() {
        return null;
    }

    @Override
    public void save(Song song) {
        repository.save(song);
    }
}
