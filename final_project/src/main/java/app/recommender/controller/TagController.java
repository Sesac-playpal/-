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
public class TagController {

    // 태그 선택 페이지 (GET)
    @GetMapping("/tags")
    public String showTagSelection(Model model) {
        List<String> tags = Arrays.asList("Multiplayer", "Open World", "Story Rich", "Fantasy", "Strategy");
        model.addAttribute("tags", tags);
        return "tag-selection";
    }

    // 선택한 태그를 세션에 저장하고 추천 페이지로 이동
    @PostMapping("/tags")
    public String processTagSelection(@RequestParam List<String> selectedTags, HttpSession session) {
        UserPreferencesDTO userPreferences = (UserPreferencesDTO) session.getAttribute("userPreferences");
        if (userPreferences != null) {
            userPreferences.setTags(selectedTags);
            session.setAttribute("userPreferences", userPreferences);
        }
        return "redirect:/survey/recommend";
    }
}