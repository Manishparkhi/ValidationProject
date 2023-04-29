package com.validation.ValidationProject.repository;

import com.validation.ValidationProject.model.Model;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {
    List<Model> allUser = new ArrayList<>();
    public List<Model> getAllUser() {
        return allUser;
    }

    public boolean save(Model model) {
        allUser.add(model);
        return true;
    }
}
