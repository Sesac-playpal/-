package app.recommender.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import app.recommender.model.UserPreferencesDTO;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/recommender")
public class GenreController {
    // 장르 선택 페이지 (GET)
    @GetMapping("/genres")
    public String showGenreSelection(Model model) {
        List<String> genres = Arrays.asList("Action", "Adventure", "RPG", "Shooter", "Strategy");
        model.addAttribute("genres", genres);
        return "genre-selection";
    }
    
    // 선택한 장르를 세션에 저장하고 태그 선택 페이지로 이동
    @PostMapping("/genres")
    public String processGenreSelection(@RequestParam List<String> selectedGenres, HttpSession session) {
        UserPreferencesDTO userPreferences = new UserPreferencesDTO();
        userPreferences.setGenres(selectedGenres);
        session.setAttribute("userPreferences", userPreferences);
        return "redirect:/survey/tags";
    }
}
