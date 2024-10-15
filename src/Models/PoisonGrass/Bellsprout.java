package Models.PoisonGrass;

import ru.ifmo.se.pokemon.Pokemon;

import Moves.*;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {

    private static final double height = 0.7;
    private static final double weight = 4.0;
    private static final String color = "GREEN";

    public Bellsprout() {
        super();
        setType(Type.POISON, Type.GRASS);
    }

    public Bellsprout(String name, int level) {
        super(name, level);
        setType(Type.POISON, Type.GRASS);
        setStats(50, 75, 35, 70, 30, 40);
        setMove(new Confide(), new Venoshock());
    }
}
