package com.example.leoniplatform.service;

import java.io.IOException;
import java.util.stream.Stream;

import com.example.leoniplatform.model.File;
import com.example.leoniplatform.repository.FileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;


@Service
public class FileStorageService {

    @Autowired
    private FileRepository filesRepository;

    public File store(MultipartFile file) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        File FileDB = new File(fileName, file.getContentType(), file.getBytes());

        return filesRepository.save(FileDB);
    }

    public File getFile(String id) {
        return filesRepository.findById(id).get();
    }

    public Stream<File> getAllFiles() {
        return filesRepository.findAll().stream();
    }
}
