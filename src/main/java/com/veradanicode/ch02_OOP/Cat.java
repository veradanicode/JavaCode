package com.veradanicode.ch02_OOP;

public class Cat {

    private int claws;
    private String whiskers;
    private Boolean sharpTeeth;

    public Cat(String whiskers, int claws, Boolean sharpTeeth) {
        this.whiskers = whiskers;
        this.claws = claws;
        this.sharpTeeth = sharpTeeth;
    }

    public String devour(){
        System.out.println("I will devour you!!");
        return "I will devour you!!";
    }
}
