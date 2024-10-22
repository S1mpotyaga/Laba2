package models.poison;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.*;

public class Gulpin extends Pokemon {

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
