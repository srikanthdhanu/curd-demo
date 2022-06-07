package com.syntaxerror.demo.service.implementation;

import com.syntaxerror.demo.entity.Users;
import com.syntaxerror.demo.repository.UserRepository;
import com.syntaxerror.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImple implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public List<Users> getAllUsers() {
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int id) throws  Exception {
        Users deleteUser = null;
        try{
            deleteUser = userRepository.findById(id).orElse(null);
            if(deleteUser == null){
                throw new Exception("User is not available");
            }else {
                userRepository.deleteById(id);
            }
        }catch(Exception e){
            throw e;
        }
        return deleteUser;
    }
}
