package com.user.service;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311L,"Shubham Gautam","9548425684"),
            new User(1312L,"Kartik Rai","9548425681"),
            new User(1313L,"Jatin Khandelwal","9548445684")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
