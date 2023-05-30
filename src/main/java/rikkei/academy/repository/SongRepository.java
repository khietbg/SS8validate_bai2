package rikkei.academy.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import rikkei.academy.model.entity.Song;

@Repository
public interface SongRepository extends PagingAndSortingRepository<Song,Long> {
}
