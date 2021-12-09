package ru.gbjava2lesson1;

public class Track implements Barrier {

    private double distance;

    public Track(double distnce) {
        this.distance = distnce;
    }

    public void size() {
        System.out.println("Дорожка длиной: "+ distance + " м");
    }

    public boolean checkAthlet (Athlet athlet) {
        if (athlet.getMaxDistance() >= distance) {
            System.out.println(athlet.getName() + " смог пробежать дистанцию " + distance + " м");
            return true;
        } else {
            System.out.println(athlet.getName() + " не смог пробежать дистанцию " + distance + " м");
            return false;
        }
    }
}
