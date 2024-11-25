package com.study.javastudy.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<Users> getUser() {
        return userRepository.findAll();
    }

    public Users createUser(UserDto userDto) {
        Users users = Users.builder().
                name(userDto.getName()).
                age(userDto.getAge()).
                build();

        return userRepository.save(users);
    }
}
