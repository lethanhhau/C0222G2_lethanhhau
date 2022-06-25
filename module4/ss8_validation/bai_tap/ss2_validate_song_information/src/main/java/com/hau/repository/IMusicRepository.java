package com.hau.repository;

import com.hau.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMusicRepository extends JpaRepository<Music, Integer> {

    @Query(value = " select * from music where name_of_the_song like :searchValue", nativeQuery = true)
    Page<Music> findByKeyword(Pageable pageable, @Param("searchValue") String searchValue);

}
