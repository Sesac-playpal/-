package app.recommender.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import app.recommender.model.UserPreferencesDTO;

@Service
public class RecommendationService {

    public Map<String, Object> getRecommendations(UserPreferencesDTO userPreferences) {
        String recommendedGame = "";
        List<String> relatedGames = new ArrayList<>();

        try {
            // Python 실행 명령어 생성
            String genres = String.join(",", userPreferences.getGenres());
            String tags = String.join(",", userPreferences.getTags());
            ProcessBuilder processBuilder = new ProcessBuilder("python", "recommend.py", genres, tags);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();

            // Python의 출력 읽기
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            StringBuilder output = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                output.append(line);
            }
            process.waitFor();

            // JSON 파싱
            String jsonOutput = output.toString();
            if (!jsonOutput.isEmpty()) {
                Map<String, Object> result = new ObjectMapper().readValue(jsonOutput, Map.class);
                recommendedGame = (String) result.get("recommendedGame");
                relatedGames = (List<String>) result.get("relatedGames");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 결과 저장
        Map<String, Object> response = new HashMap<>();
        response.put("recommendedGame", recommendedGame);
        response.put("relatedGames", relatedGames);
        return response;
    }
}