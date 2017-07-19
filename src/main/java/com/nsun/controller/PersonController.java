package com.nsun.controller;

import com.nsun.entity.Person;
import com.nsun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by wangzy on 2017/7/18.
 */
@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/list")
    public String list(Model model){
        int i = 1;
       Person person = personService.findOneById(i);
       List<Person> list = personService.findAll();
       model.addAttribute("person",person);
       model.addAttribute("list",list);
        return "login";
    }
}
