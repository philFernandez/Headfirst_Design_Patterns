public abstract class Character {
    WeaponBehavior weapon;

    public abstract void fight();

    public void performWeaponBehavior() {
        weapon.useWeapon();
    }

    public void setWeaponBehavior(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    // Return string representation of character's weapon
    @Override
    public String toString() {
        return weapon.toString();
    }
}