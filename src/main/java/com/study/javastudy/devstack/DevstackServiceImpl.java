package com.study.javastudy.devstack;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DevstackServiceImpl implements DevstackService{

    private final DevstackRepository devstackRepository;

    @Override
    public String save() {
        return "";
    }

    @Override
    public List<Devstack> getList(){
        return devstackRepository.findAll();
    }
}
