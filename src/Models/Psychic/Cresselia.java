package Models.Psychic;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

import Moves.*;

public class Cresselia extends Pokemon {

    private static double hieght = 1.5;
    private static double weight = 85.6;
    private static String color = "YELLOW";

    Cresselia() {
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