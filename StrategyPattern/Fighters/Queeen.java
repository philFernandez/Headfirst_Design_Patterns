public class Queeen extends Character {
    public Queeen() {
        weapon = new KnifeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("The Queen is fighting!");
        weapon.useWeapon();
    }
}
