package com.example;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.awt.*;
import java.sql.Array;


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

//    @RequestMapping(value = "/index", method= RequestMethod.POST)
////    public String fileRead(@ModelAttribute Songs song,Model model){
////    return "index";
////    }
////    @ModelAttribute … (1)
////    public Songs setUpSongs() {
////        Songs songs = new Songs();
////        songs.setSongList(Arrays.asList(new Song("1","2","3","4","5"));
////        return songs;
}
