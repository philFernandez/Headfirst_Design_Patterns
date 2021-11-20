import java.util.List;

public class Driver {
    public static void main(String[] args) {
        String[] ducks = { "Mallard", "Big Duck", "Little Duck", "Huge Duck", "Tiny Duck", "Monster Duck",
                "Sissy Duck" };
        List<String> duckList = new MyStringList(ducks);
        System.out.println(duckList);

        List<String> sub = duckList.subList(3, 5);
        System.out.println(sub);

    }
}
