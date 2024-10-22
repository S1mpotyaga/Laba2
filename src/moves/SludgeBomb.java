package moves;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Effect;

public class SludgeBomb extends SpecialMove {
    public SludgeBomb() {
        super(Type.PSYCHIC, 90, 100);
    }

    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon def){
        return true;
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        if (Math.random() <= 0.3){
            Effect.poison(p);
        }
    }

    @Override
    protected String describe() {
        return "использует атаку Sludge Bomb";
    }
}
