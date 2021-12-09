package ru.gbjava2lesson1;

public class Wall implements Barrier {

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public void size() {
        System.out.println("Стена высотой: "+ height + " м");
    }

    public boolean checkAthlet (Athlet athlet) {
        if (athlet.getMaxHeight() >= height) {
            System.out.println(athlet.getName() + " смог перепрыгнуть стену высотой " + height + " м");
            return true;
        } else {
            System.out.println(athlet.getName() + " не смог перепрыгнуть стену высотой " + height + " м");
            return false;
          }
    }
}
