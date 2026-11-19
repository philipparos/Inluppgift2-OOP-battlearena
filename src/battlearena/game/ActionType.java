package battlearena.game;

import battlearena.characters.Fighter;

public interface ActionType {

    int attackDamageRoll();
    int specialActionRoll();
    int actualAttackDamage(Fighter defender);



    // ha en attackmetod och en specialmetod som skrivs över
    // public void testmetod(); //vill döpa denna till något med att den ska randomiza actiontype samt att den ska göra respektive randomization
}
