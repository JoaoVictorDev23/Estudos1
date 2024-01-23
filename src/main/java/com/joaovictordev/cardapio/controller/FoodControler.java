package com.joaovictordev.cardapio.controller;

import com.joaovictordev.cardapio.food.Food;
import com.joaovictordev.cardapio.food.FoodRepository;
import com.joaovictordev.cardapio.food.FoodRequestDTO;
import com.joaovictordev.cardapio.food.FoodResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodControler {

    @Autowired
    private FoodRepository repository;


    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

}
