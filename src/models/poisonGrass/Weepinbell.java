package models.poisonGrass;

import moves.*;

public class Weepinbell extends Bellsprout {

    public Weepinbell() {
        super();
    }

    public Weepinbell(String name, int level) {
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        addMove(new Slam());
    }
}
