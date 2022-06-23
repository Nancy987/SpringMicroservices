package com.Prograd.MicroservicesDemo.Controllers;

import com.Prograd.MicroservicesDemo.Bean.AdditionSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {
    @Autowired
    private AdditionSender additionSender;

    @GetMapping("/addition")
    public String displayAddition(){

        additionSender = new AdditionSender(additionSender.getNum1(),additionSender.getNum2());

        String str = "Addition of "+additionSender.getNum1()+" and "+additionSender.getNum2()+"="+
        additionSender.getAdd();
        return str;
        //return new AdditionSender(additionSender.getNum1(),additionSender.getNum2());
    }
}


