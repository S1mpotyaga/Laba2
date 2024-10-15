package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;

public class Venoshock extends SpecialMove {

    public Venoshock() {
        super(Type.POISON, 65, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applyOppDamage(Pokemon def, double damage) {
        if (def.getCondition() == Status.POISON) {
            def.setMod(Stat.HP, (int) Math.round(2 * damage));
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Venoshock";
    }
}
