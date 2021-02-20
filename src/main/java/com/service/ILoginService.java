package com.service;

import com.Model.User;
import com.Model.UserContext;

import java.util.List;

public interface ILoginService {
    public User findUserById(Long userId);
    public List<User> findAllUser();
    public String saveUser(UserContext userContext);
    public String editUser (UserContext userContext);
    public String deleteUser(Long userId);


}
