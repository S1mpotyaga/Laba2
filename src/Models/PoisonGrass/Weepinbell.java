package Models.PoisonGrass;

import Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Weepinbell extends Bellsprout {

    private static final double height = 0.99;
    private static final double weight = 6.39;
    private static final String color = "GREEN";

    public Weepinbell() {
        super();
    }

    public Weepinbell(String name, int level) {
        super(name, level);
        setStats(65, 90, 50, 85, 45, 55);
        addMove(new Slam());
    }
}
