package com.Prograd.MicroservicesDemo.Bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstspringmicroservices")
public class NameSender {
    private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public NameSender() {
    }

    public NameSender(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
