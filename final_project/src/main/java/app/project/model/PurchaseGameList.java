package app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class PurchaseGameList {
    private Long purchaseGameId;
    private Long gameId;
    private Long purchaseId;
    private Double price; // 10,2 숫자는 Double로 처리
} 