package models.poison;

import moves.*;

public class Swalot extends Gulpin {

    public Swalot() {
        super();
    }

    public Swalot(String name, int level) {
        super(name, level);
        setStats(100, 73, 83, 73, 83, 55);
        addMove(new BodySlam());
    }
}