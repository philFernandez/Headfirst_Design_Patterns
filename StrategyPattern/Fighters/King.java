public class King extends Character {

    public King() {
        weapon = new SwordBehavior();
    }

    @Override
    public void fight() {
        System.out.println("King is fighting!");
        weapon.useWeapon();
    }

}
