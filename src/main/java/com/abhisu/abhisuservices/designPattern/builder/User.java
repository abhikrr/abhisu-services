package com.abhisu.abhisuservices.designPattern.builder;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class User {

    private String firstName;

    private String lastName;

    private LocalDate birthday;

    private Address address;
}
