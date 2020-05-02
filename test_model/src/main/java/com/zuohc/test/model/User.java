package com.zuohc.test.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private Integer userId;
    private String userName;
}
