package ru.gbjava2lesson1;

public class Robot implements Athlet {

    private String name;

    private double maxHeight = 0.5, maxDistance = 700;

    public Robot(String name) {
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
        System.out.println("Я - робот, и я умею бегать на расстояние: " + maxDistance + " м");
    }

    @Override
    public void jump() {
        System.out.println("Я - робот, и я умею прыгать в высоту на: " + maxHeight + " м");
    }
}


