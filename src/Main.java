import Models.Poison.*;
import Models.Psychic.*;
import Models.PoisonGrass.*;
import Models.Psychic.Cresselia;
import ru.ifmo.se.pokemon.Battle;

class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        //Создание покемонов
        Cresselia cresselia = new Cresselia("Cresselia", 1);
        Gulpin gulpin = new Gulpin("Gulpin", 1);
        Swalot swalot = new Swalot("Swalot", 1);
        Bellsprout bellsprout = new Bellsprout("Bellsprout", 1);
        Weepinbell weepinbell = new Weepinbell("Weepinbell", 1);
        Victreebel victreebel = new Victreebel("Victreebel", 1);

        //Добавление покемонов в команды
        battle.addAlly(cresselia);
        battle.addAlly(gulpin);
        battle.addAlly(swalot);

        battle.addFoe(bellsprout);
        battle.addFoe(weepinbell);
        battle.addFoe(victreebel);

        //Сражение
        battle.go();
    }
}