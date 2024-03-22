package com.pet.controller;

import com.pet.dto.Pet;
import com.pet.dto.PetDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PetRestController {

    @GetMapping("/profile")
    public void a(@RequestParam("petId") Long petId){



    }
}
