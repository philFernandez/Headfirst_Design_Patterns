public class Knight extends Character {

    public Knight() {
        weapon = new AxeBehavior();
    }

    @Override
    public void fight() {
        System.out.println("The Knight is fighting!");
        weapon.useWeapon();
    }

}
