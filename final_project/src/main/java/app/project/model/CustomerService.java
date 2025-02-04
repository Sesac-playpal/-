package main.java.app.project.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter @Setter @ToString
public class CustomerService {
    private Long csId;
    private Long userId;
    private String title;
    private String description; // CLOB 타입은 String으로 처리
    private String csStatus; // 상태는 String으로 처리
    private Timestamp beginDate;
    private Timestamp endDate;
} 