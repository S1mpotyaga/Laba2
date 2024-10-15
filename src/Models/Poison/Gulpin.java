package Models.Poison;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import Moves.*;

public class Gulpin extends Pokemon {

    private static final double height = 0.41;
    private static final double weight = 10.29;
    private static final String color = "GREEN";

    public Gulpin() {
        super();
        setType(Type.POISON);
    }

    public Gulpin(String name, int level) {
        super(name, level);
        setType(Type.POISON);
        setStats(70, 43, 53, 43, 53, 40);
        setMove(new SludgeBomb(), new IceBeam(), new DreamEater());
    }
}
