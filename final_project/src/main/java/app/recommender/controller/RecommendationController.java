package app.recommender.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import app.recommender.model.UserPreferencesDTO;
import app.recommender.service.RecommendationService;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/recommender")
public class RecommendationController {
    private final RecommendationService recommendationService;

    public RecommendationController(RecommendationService recommendationService) {
        this.recommendationService = recommendationService;
    }

    // 추천 결과 페이지 (GET)
    @GetMapping("/recommend")
    public String showRecommendations(HttpSession session, Model model) {
        UserPreferencesDTO userPreferences = (UserPreferencesDTO) session.getAttribute("userPreferences");
        if (userPreferences == null) {
            return "redirect:/survey/genres";
        }

        // 추천 알고리즘 실행
        Map<String, Object> recommendations = recommendationService.getRecommendations(userPreferences);
        model.addAttribute("recommendedGame", recommendations.get("recommendedGame"));
        model.addAttribute("relatedGames", recommendations.get("relatedGames"));
        
        return "recommendation-result";
    }
}
