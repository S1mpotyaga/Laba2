package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove {

    public ShadowBall() {
        super(Type.GHOST, 80, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2){
            p.setMod(Stat.DEFENSE, (int)(p.getStat(Stat.DEFENSE)) - 1);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Shadow Ball";
    }
}
