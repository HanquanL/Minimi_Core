package com.MiniMe.CoreFileManagement.Service;

import com.MiniMe.CoreFileManagement.Entity.File;
import com.MiniMe.CoreFileManagement.Repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FileService {

    @Autowired
    private FileRepository fileRepository;

    public List<File> getAllFiles() {
        return fileRepository.findAll();
    }

    public Optional<File> getFileById(Long id) {
        return fileRepository.findById(id);
    }

    public File saveFile(File file) {
        return fileRepository.save(file);
    }

    public File updateFile(Long id, File file) {
        file.setId(id);
        return fileRepository.save(file);
    }

    public void deleteFile(Long id) {
        fileRepository.deleteById(id);
    }
}
