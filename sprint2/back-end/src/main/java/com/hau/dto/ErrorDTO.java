package com.hau.dto;

import com.hau.model.OrderService;
import lombok.Data;

import java.util.List;

@Data
public class ErrorDTO {
    private String message;
    private List<String> messageList;
    private OrderService orderService;
}
