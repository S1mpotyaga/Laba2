package models.psychic;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import moves.*;

public class Cresselia extends Pokemon {

    public Cresselia() {
        super();
        setType(Type.PSYCHIC);
    }

    public Cresselia(String name, int level) {
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(120, 70, 110, 75, 120, 85);
        setMove(new Psychic(), new ShadowBall(), new AuroraBeam(), new DreamEater());
    }
}