package com.hau.dto;

import com.hau.model.Bill;
import com.hau.model.Customer;
import com.hau.model.OrderService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
public class PaymentDto {
    private List<OrderService> productOrderList;
    private Customer customer;
    private Bill bill;
}
