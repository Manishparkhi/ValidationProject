package com.validation.ValidationProject.services;

import com.validation.ValidationProject.model.Model;
import com.validation.ValidationProject.repository.Repository;
import jakarta.validation.constraints.Null;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repo;
    public List<Model> getAllUser() {
      return   repo.getAllUser();

    }

    public Model findUser(String id) {
        List<Model> listUser = repo.getAllUser();

        for(Model val : listUser){
            if(id.equals(val.getUserId())){
                return val;
            }
        }
        return null;
    }

    public String addUser(Model model) {
       boolean insertion = repo.save(model);

       if(insertion == true){
           return "Add User";
       }else{
           return "Something wants Wrong.....!!!!!";
       }

    }

    public String updateInfo(String id, Model data) {

        List<Model> listUser = repo.getAllUser();

        for(Model val : listUser){
            if(val.getUserId().equals(id)){
                val.setDate_Time(data.getDate_Time());
                val.setEmail(data.getEmail());
                val.setUserId(data.getUserId());
                val.setDateOfBirth(data.getDateOfBirth());
                val.setUsername(data.getUsername());
                return "Successfully Updated...!!!!!";
            }
        }
        return "Id Not Found....!!!!!";

    }

    public String deleteId(String id) {
        List<Model> listUser = repo.getAllUser();

        for(Model val : listUser){
            if(val.getUserId().equals(id)){
                listUser.remove(val);
                return "Successfully Deleted Id.....!!!!!";
            }
        }
        return "Id Not Found.....!!!!!";
    }
}
