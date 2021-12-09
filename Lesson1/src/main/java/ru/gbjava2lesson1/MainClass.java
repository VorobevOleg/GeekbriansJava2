package ru.gbjava2lesson1;

// Задания 1 - 4 выполнены.

public class MainClass {
    public static void main(String[] args) {

        Athlet[] athlets = new Athlet[3];
        athlets[0] = new Human("Boris");
        athlets[1] = new Cat("Murzik");
        athlets[2] = new Robot("R2D2");

        Barrier[] barriers = new Barrier[2];
        barriers[0] = new Wall(0.7);
        barriers[1] = new Track(600);

        for (Athlet a : athlets) {
            a.run();
            a.jump();
        }

        System.out.println("Есть полоса препятствий:");
        for (Barrier b : barriers) {
            b.size();
        }

        for (int i = 0; i < athlets.length; i++) {
            for (int j = 0; j < barriers.length; j++) {
                if (!barriers[j].checkAthlet(athlets[i])) {
                    break;
                }
            }
        }
    }

}
