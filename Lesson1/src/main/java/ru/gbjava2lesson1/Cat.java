package ru.gbjava2lesson1;

public class Cat implements Athlet {

    private String name;

    private double maxHeight = 2, maxDistance = 500;

    public Cat(String name) {
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
        System.out.println("Я - кот, и я умею бегать на расстояние: " + maxDistance + " м");
    }

    @Override
    public void jump() {
        System.out.println("Я - кот, и я умею прыгать в высоту на: " + maxHeight + " м");
    }

}





