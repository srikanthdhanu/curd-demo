package com.syntaxerror.demo.service;

import com.syntaxerror.demo.entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();
    public Users getUserById(int id);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int id) throws Exception;
}
