package com.syntaxerror.demo.controller;

import com.syntaxerror.demo.entity.Users;
import com.syntaxerror.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public ResponseEntity<List<Users>> getAllUsers(){
        List<Users> users = null;

        try{
            users = userService.getAllUsers();

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<List<Users>>(users,HttpStatus.OK);

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Users> getUserById(@PathVariable("id") int id){
        Users users = null;

        try{
            users = userService.getUserById(id);

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<Users>(users,HttpStatus.OK);

    }

    @PostMapping("/addorupdate")
    public ResponseEntity<Users> addOrUpdate( @RequestBody  Users user){
        Users users = null;

        try{
            users = userService.addOrUpdateUser(user);

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<Users>(users,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Users> deleteUser( @PathVariable("id") int id){
        Users users = null;
      // Git changes
        try{
            users = userService.deleteUser(id);

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<Users>(users,HttpStatus.OK);

    }

    //Just for git check out
    @DeleteMapping("/delete1/{id}")
    public ResponseEntity<Users> deleteUser2( @PathVariable("id") int id){
        Users users = null;
        // Git changes
        try{
            users = userService.deleteUser(id);

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<Users>(users,HttpStatus.OK);

    }

    //Just for git check out
    @DeleteMapping("/delete1/{id}")
    public ResponseEntity<Users> deleteUser4( @PathVariable("id") int id){
        Users users = null;
        // Git changes
        try{
            users = userService.deleteUser(id);

        }catch (Exception e){
            e.getMessage();
        }

        return  new ResponseEntity<Users>(users,HttpStatus.OK);

    }




}
