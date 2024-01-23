package com.joaovictordev.cardapio.food;

import com.joaovictordev.cardapio.food.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food,Integer> {
}
