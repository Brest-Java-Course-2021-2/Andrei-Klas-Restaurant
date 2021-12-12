package com.epam.brest.web_app;

import com.epam.brest.model.Food;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * Hello MVC controller.
 */
@Controller
public class HelloController {

    private static List<Food> foodArrayList = new ArrayList<>();


    public HelloController(){
        foodArrayList.add(new Food(1, "Pasta", 230));
        foodArrayList.add(new Food(2, "Potato", 120));
        foodArrayList.add(new Food(3, "Tomato", 80));

    }



    @GetMapping(value = "/orders")
    public String orders(Model model) {

//        System.out.println("hello(name:'" + name + "')");
        model.addAttribute("foodsList", foodArrayList);
        return "orders";
    }
}
