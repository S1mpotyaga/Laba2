package Moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class AuroraBeam extends SpecialMove {

    public AuroraBeam() {
        super(Type.ICE, 65, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1){
            p.setMod(Stat.ATTACK, (int)p.getStat(Stat.ATTACK) - 1);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Aurora Beam";
    }
}
