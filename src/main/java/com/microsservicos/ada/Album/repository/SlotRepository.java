package com.microsservicos.ada.Album.repository;

import com.microsservicos.ada.Album.model.Slot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SlotRepository extends JpaRepository<Slot, Long> {
}
