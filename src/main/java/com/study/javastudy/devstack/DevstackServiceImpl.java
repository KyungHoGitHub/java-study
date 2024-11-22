package com.study.javastudy.devstack;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DevstackServiceImpl implements DevstackService{

    private final DevstackRepository devstackRepository;

    @Override
    public String save() {
        return "";
    }
}
