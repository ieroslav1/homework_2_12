package pro.sky.homework_2_12.service;

import org.springframework.stereotype.Service;
import pro.sky.homework_2_12.exceptions.ZeroDivideIllegalArgumentException;

@Service
public class CalcServiceImpl implements CalcService{


    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    public Integer plusResults(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены!");
        }
        return a + b;
    }

    public Integer minusResults(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены!");
        }
        return a - b;
    }

    public Integer multiplyResults(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены!");
        }
        return a * b;
    }

    public Integer divideResults(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Все поля должны быть заполнены!");
        }
        if (b == 0) {
            throw new ZeroDivideIllegalArgumentException("Делить на ноль нельзя!");
        }
        return a / b;
    }
}