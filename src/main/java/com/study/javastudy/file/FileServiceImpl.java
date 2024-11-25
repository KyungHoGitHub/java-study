package com.study.javastudy.file;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService {

    private final FileRepository fileRepository;

    @Override
    public void saveFile(MultipartFile file) {

        File data = File.builder()
                .originalName(file.getName())
                .build();


        fileRepository.save(data);
    }
}
