package com.pet.controller;

import com.pet.dto.Pet;
import com.pet.dto.PetDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PetController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model){

        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet(1L,"Fluffy", 3, "/images/dog.png"));
        pets.add(new Pet(2L,"Fluffy", 3, "/images/dog.png"));
        pets.add(new Pet(3L,"Fluffy", 3, "/images/dog.png"));
        pets.add(new Pet(4L,"Fluffy", 3, "/images/dog1.jpg"));
        pets.add(new Pet(5L,"Fluffy", 3, "/images/dog1.jpg"));
        pets.add(new Pet(6L,"Fluffy", 3, "/images/dog1.jpg"));


        model.addAttribute("pets", pets);
        return "dashboard";
    }

    @GetMapping("/profile-api")
    public String a(@RequestParam("petId") Long petId,Model model){

        System.out.println("petId "+petId);

        PetDetails petDetails = new PetDetails("/images/dog.png","dog","aadmadmdfnf");

        model.addAttribute("petDetails", petDetails);
        return "profile";


    }

    @GetMapping("/adoptionForm")
    public String adoptionForm(){
        return "adoptionForm";
    }



}
