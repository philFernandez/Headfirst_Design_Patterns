public class Troll extends Character {

    public Troll() {
        weapon = new BowAndArrowBehavior();
    }

    @Override
    public void fight() {
        System.out.println("The troll is fighting!");
        weapon.useWeapon();
    }
}
