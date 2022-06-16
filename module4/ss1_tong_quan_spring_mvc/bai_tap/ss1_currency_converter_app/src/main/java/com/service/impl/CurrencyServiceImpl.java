package com.service.impl;

import com.service.ICurrencyService;
import org.springframework.stereotype.Service;

@Service
public class CurrencyServiceImpl implements ICurrencyService {
    @Override
    public int change(int usd, int rate) {
        return usd * rate;
    }
}
