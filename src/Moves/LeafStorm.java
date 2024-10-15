package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.SpecialMove;

public class LeafStorm extends SpecialMove {

    public LeafStorm() {
        super(Type.GRASS, 130, 90);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.setMod(Stat.SPECIAL_ATTACK, (int)p.getStat(Stat.SPECIAL_ATTACK) - 2);
    }

    @Override
    protected String describe() {
        return "использует атаку Leaf Storm";
    }
}
