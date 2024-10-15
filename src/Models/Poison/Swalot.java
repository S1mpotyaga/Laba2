package Models.Poison;

import Moves.*;

public class Swalot extends Gulpin {

    private static double height = 1.7;
    private static double weight = 80;
    private static String color = "PURPLE";

    public Swalot() {
        super();
    }

    public Swalot(String name, int level) {
        super(name, level);
        setStats(100, 73, 83, 73, 83, 55);
        addMove(new BodySlam());
    }
}