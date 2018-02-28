package com.example.db_controlle;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

public interface SongRepository extends Repository< Song,String> {
    Page<Song> findAll(Pageable pageable);
}
