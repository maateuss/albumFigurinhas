package com.microsservicos.ada.Album.repository;


import com.microsservicos.ada.Album.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {

}
