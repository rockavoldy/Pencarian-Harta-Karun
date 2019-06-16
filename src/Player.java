import java.util.ArrayList;

public class Player {
    private int maxHealthPoint;
    private int maxManaPoint;
    private int[] stats = {5,5,5,5}; // berturut-turut VIT, STR, INT, AGI
    public int healthPoint = 100;
    public int manaPoint = 100;
    public String usedSenjata = "Pisau Dapur";
    public ArrayList<Item> isiBackpack = new ArrayList<Item>(); // bakal digunakan nanti setelah class Item dibuat
    public Scene sceneAktif; // bakal digunakan nanti setelah class Scene dibuat
    private boolean gameOver = false;

    public void Player() {
        if (healthPoint == 0) {
            gameOver = true;
        }
    }

    public void addKeTas(Item objectItem) {

    }

    public void showTas() {

    }

//    private chooseTas(indexItem) {
//
//    }
}
