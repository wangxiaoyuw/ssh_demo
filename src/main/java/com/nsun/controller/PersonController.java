package com.nsun.controller;

import com.nsun.entity.Person;
import com.nsun.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@RequestParam("username")String username,@RequestParam("address")String address){
        Person person = new Person();
        person.setAddress(address);
        person.setUsername(username);
        personService.save(person);
        return "success";
    }


    @RequestMapping("/delete/{id}")
    public String detele(@PathVariable("id")Integer id){
       // Person person = personService.findOneById(id);
           personService.delete(id);
           return "success";
    }
}
