package com.study.javastudy.devstack;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev_stack")
@RequiredArgsConstructor
public class DevstackController {

    private final DevstackService devstackService;

    @GetMapping
    public ResponseEntity<List<Devstack>> getDevstack() {
        List<Devstack> testList = devstackService.getList();

        return ResponseEntity.ok().body(testList);
    }
}
