package com.codegym.controller;
import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/users")
public class UserController {

    @GetMapping("")
    public ModelAndView form(){
    ModelAndView modelAndView=new ModelAndView("/home","users",new User());
    return modelAndView;

    }
    @PostMapping("create")
    public ModelAndView view(@ModelAttribute  User user){
        ModelAndView modelAndView=new ModelAndView("/view");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
