package com.validation.ValidationProject.controller;

import com.validation.ValidationProject.model.Model;
import com.validation.ValidationProject.services.Service;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")

public class Controller {

    @Autowired
    private Service service;

    @GetMapping(value = "allUser")
    public List<Model> getAllUser(){
        return service.getAllUser();
    }

    @GetMapping(value = "getUser/{id}")
    public Model getUser(@PathVariable String id){
        return service.findUser(id);
    }

    @PostMapping( value = "addUser")
    public String addUser(@Valid @RequestBody Model model){
        return service.addUser(model);
    }
    @PutMapping(value = "updateInfo/{id}")
    public String updateInfo(@PathVariable String id ,@RequestBody Model data){

        return service.updateInfo(id,data);

    }
    @DeleteMapping(value = "delete/user/{id}")

    public String deleteUser(@PathVariable String id){
        return service.deleteId(id);
    }
}
