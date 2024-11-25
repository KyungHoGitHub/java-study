package com.study.javastudy.file;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequiredArgsConstructor
@RequestMapping("/upload")
public class FileController {

    // file 서비스 레이어 DI
    private final FileService  fileService;

    @CrossOrigin
    @PostMapping
    public ResponseEntity<String> saveFile(@RequestParam ("file") MultipartFile file){
        //
        String result = null;

        fileService.saveFile(file);
        return ResponseEntity.ok().body("ok");
    }
}
