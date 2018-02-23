package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class IndexForm {

    static private Integer IdCount=0;

    @RequestMapping(value="/index")
    public String index(Model model){
        model.addAttribute("song", new Song());
        return "index";
    }

    @RequestMapping(value = "/index", method= RequestMethod.POST)
    public String indexFormSubmit(@ModelAttribute Song song, Model model){
        song.setId(IdCount);
        model.addAttribute("song", song);
        return "index";
    }

}
