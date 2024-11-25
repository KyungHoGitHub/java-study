package com.study.javastudy.file;

import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    void saveFile(MultipartFile file);
}
