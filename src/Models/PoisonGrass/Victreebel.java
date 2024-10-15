package Models.PoisonGrass;

import Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Victreebel extends Weepinbell {

    private static final double height = 1.7;
    private static final double weight = 15.5;
    private static final String color = "GREEN";

    public Victreebel() {
        super();
    }

    public Victreebel(String name, int level) {
        super(name, level);
        setStats(80, 105, 65, 100, 70, 70);
        addMove(new LeafStorm());
    }
}
