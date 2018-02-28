package com.example.db_controlle;

import com.sun.tools.javac.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;


@Controller
@EnableAutoConfiguration //自動でBean定義
public class SongController {

    @Autowired
    SongRepository songRepository;

    @RequestMapping("/")
    public String getAllColumn(Model model){
        System.out.println("[START]データベースに接続してデータを取得します。");
        ArrayList<Song> songs = new ArrayList<Song>();
        Page<Song> songPage = songRepository.findAll(new PageRequest(0,5));
        for(Song song: songPage){
            songs.add(new Song(song.getId(), song.getName(),song.getCount()));
            System.out.println(song.getId()+ " = "+song.getName());
        }
        model.addAttribute("songs", songs);
        System.out.println("[END] データベースに接続してデータを取得します。");
        return "index";
    }

    public SongRepository getSongRepository() {
        return songRepository;
    }
}
