package ru.gbjava2lesson1;

public class Human implements Athlet {

    private String name;

    private double maxHeight = 1, maxDistance = 1000;

    public Human (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getMaxHeight() {
        return maxHeight;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    @Override
    public void run() {
        System.out.println("Я - человек, и я умею бегать на расстояние: " + maxDistance + " м");
    }

    @Override
    public void jump() {
        System.out.println("Я - человек, и я умею прыгать в высоту на: " + maxHeight + " м");
    }



}
