package com.Prograd.MicroservicesDemo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstspringmicroservices")
public class AdditionSender {
    private int num1;
    private int num2;
    private int addition;

    public AdditionSender(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        this.addition = num1+num2;
    }

    public int getAdd() {
        return addition;
    }

    public void setAdd(int addition) {
        this.addition = addition;
    }

    public AdditionSender(){

    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
