public class Game {
    public static void main(String[] args) {
        Character king = new King();
        king.fight();
        king.setWeaponBehavior(new AxeBehavior());
        Character knight = new Knight();
        knight.fight();
        king.fight();
    }
}
