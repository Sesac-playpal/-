package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class Purchase {
    private Long purchaseId;
    private Long userId;
    private Timestamp purchaseDate;
    private Double totalPrice; // 10,2 숫자는 Double로 처리
} 