package com.example.casemd4_canhan.controller.account;

import com.example.casemd4_canhan.message.response.ResponseMessage;
import com.example.casemd4_canhan.model.account.User;
import com.example.casemd4_canhan.service.account.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins = "*")
@RequestMapping("user")
@RestController
public class UserController {
    @Autowired
    UserServiceImpl userService;
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable Long id){
        Optional<User> user = userService.findById(id);
        if (!user.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        userService.deleteById(user.get().getId());
        return new ResponseEntity<>(new ResponseMessage("Delete Success"),HttpStatus.OK);
    }
}
