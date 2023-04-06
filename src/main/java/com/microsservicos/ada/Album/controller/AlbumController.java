package com.microsservicos.ada.Album.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/album/")
public class AlbumController {

    @GetMapping("/")
    public ResponseEntity<String> getAll() {
        return ResponseEntity.ok("Todos os albuns...");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getById(@PathVariable int id) {
        return ResponseEntity.ok("album id: " + Integer.toString(id));
    }

    @PostMapping("/")
    public ResponseEntity<String> create(@RequestBody String album) {
        return ResponseEntity.ok(album);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> edit(@PathVariable int id, @RequestBody String album) {
        return ResponseEntity.ok("album id: " + Integer.toString(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        return ResponseEntity.ok("deleted id: " + Integer.toString(id));
    }
}
