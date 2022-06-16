package com.service.impl;

import com.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements ICalculatorService {
    @Override
    public Integer calculator(Integer number1, Integer number2, String operator) {
        Integer result = 0;
        switch (operator){
            case "Addition":
                result = number1 + number2;
                break;
            case "Subtraction":
                result = number1 - number2;
                break;
            case "Multiplication":
                result = number1 * number2;
                break;
            case "Division":
                result = number1 / number2;
                break;
            default:
                try {
                    result = number1/number2;
                    result = 0;
                }catch (Exception e){
                    e.getStackTrace();
                }
                break;
        }
        return result;
    }
}
