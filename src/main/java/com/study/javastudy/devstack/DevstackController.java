package com.study.javastudy.devstack;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/dev_stack")
@RequiredArgsConstructor
public class DevstackController {

    private final DevstackService devstackService;

    @PostMapping
    public List<Devstack> getDevstack() {

        return null;
    }
}
