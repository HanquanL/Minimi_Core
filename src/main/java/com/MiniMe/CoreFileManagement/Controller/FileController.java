package com.MiniMe.CoreFileManagement.Controller;

import com.MiniMe.CoreFileManagement.Entity.File;
import com.MiniMe.CoreFileManagement.Service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/files")
public class FileController {

    @Autowired
    private FileService fileService;

    @GetMapping
    public List<File> getAllFiles() {
        return fileService.getAllFiles();
    }

    @GetMapping("/{id}")
    public ResponseEntity<File> getFileById(@PathVariable Long id) {
        return ResponseEntity.ok(fileService.getFileById(id).orElseThrow());
    }

    @PostMapping
    public ResponseEntity<File> saveFile(@RequestBody File file) {
        return ResponseEntity.status(HttpStatus.CREATED).body(fileService.saveFile(file));
    }

    @PutMapping("/{id}")
    public ResponseEntity<File> updateFile(@PathVariable Long id, @RequestBody File file) {
        return ResponseEntity.ok(fileService.updateFile(id, file));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFile(@PathVariable Long id) {
        fileService.deleteFile(id);
        return ResponseEntity.noContent().build();
    }
}
