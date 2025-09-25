package com.veradanicode.ch02_OOP;

public class Vehicle {
    private String steering;
    private String Engine;
    private Boolean tyres;

    public Vehicle(String steering, String engine, Boolean tyres) {
        this.steering = steering;
        Engine = engine;
        this.tyres = tyres;
    }
    public void accelerate(){
        System.out.println("Vroom Vroooomm!!");
    }
}
