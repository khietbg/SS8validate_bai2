package rikkei.academy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import rikkei.academy.model.entity.Song;
import rikkei.academy.model.service.ISongService;

import javax.validation.Valid;

@Controller
public class SongController {
    @Autowired
    private ISongService songService;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("song",new Song());
        return "/home";
    }
    @PostMapping("/create")
    public String create(@Valid @ModelAttribute("song")Song song, BindingResult rs){
        if (rs.hasErrors()){
            return "/home";
        }
        songService.save(song);
        return "redirect:/";
    }
}
