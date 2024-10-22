package models.poisonGrass;

import ru.ifmo.se.pokemon.Pokemon;

import moves.*;
import ru.ifmo.se.pokemon.Type;

public class Bellsprout extends Pokemon {

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
