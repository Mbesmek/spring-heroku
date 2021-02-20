package com.service;

import com.Model.User;
import com.Model.UserContext;
import com.service.repository.ILoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LoginServiceImp implements ILoginService {

    @Autowired
    ILoginRepository loginRepository;

    @Override
    public User findUserById(Long userId) {

        return loginRepository.findUserById(userId);
    }

    @Override
    public List<User> findAllUser() {
            return loginRepository.getAllUser();
    }

    @Override
    public String saveUser(UserContext userContext) {
        return null;
    }

    @Override
    public String editUser(UserContext userContext) {
        return null;
    }

    @Override
    public String deleteUser(Long userId) {
        return null;
    }
}
