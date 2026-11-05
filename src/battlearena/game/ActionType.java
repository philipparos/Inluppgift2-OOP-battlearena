package battlearena.game;

public interface ActionType {

    int attackDamageRoll();
    int specialAttackRoll();
    int attackDamage(); // lägg in attacker & defender
    int specialAttack();

    // ha en attackmetod och en specialmetod som skrivs över
    // public void testmetod(); //vill döpa denna till något med att den ska randomiza actiontype samt att den ska göra respektive randomization
}
