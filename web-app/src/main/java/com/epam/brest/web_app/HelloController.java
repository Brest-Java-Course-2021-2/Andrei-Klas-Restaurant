package com.epam.brest.web_app;

import com.epam.brest.model.Food;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Hello MVC controller.
 */
@Controller
public class HelloController {

    private static List<Food> foodArrayList = new ArrayList<>();


    public HelloController() {
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

    @RequestMapping(value = "/addFood", method = RequestMethod.POST)
    public String submit(@ModelAttribute("food") Food food,
                         BindingResult result, ModelMap model) {
        if (result.hasErrors()) {
            return "error";
        }
        model.addAttribute("name", food.getFoodName());
        model.addAttribute("cost", food.getFoodCost());
        model.addAttribute("id", food.getFoodId());
        return "employeeView";
    }
}
