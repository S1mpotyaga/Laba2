package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 95, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def) {
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.freeze(p);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Ice Beam";
    }
}
