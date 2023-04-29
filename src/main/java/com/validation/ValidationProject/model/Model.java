package com.validation.ValidationProject.model;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Model {

    @NotEmpty(message = "why userId is empty")
    private String UserId;

     @NotEmpty(message = "why username is empty")
    private String username;

    private String DateOfBirth;
    @Email
    @NotEmpty(message = "why Email empty")
    private String  email;

   @Size(min = 9 , max = 10)
   @Pattern(regexp = "[0-9]+")
    private String Phone_Number;

    @NotNull
    private String Date_Time;
}
