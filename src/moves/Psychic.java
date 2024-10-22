package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class Psychic extends SpecialMove {

    public Psychic() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.setMod(Stat.DEFENSE, (int) p.getStat(Stat.DEFENSE) - 1);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Psychic";
    }
}
