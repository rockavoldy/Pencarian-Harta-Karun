import java.util.ArrayList;

public class Player {
    public static int maxHealthPoint;
    public static int maxManaPoint;
    private static int[] stats = {5,5,5,5}; // berturut-turut VIT, STR, INT, AGI
    public static int healthPoint = 100;
    public static int manaPoint = 100;
    public static String usedSenjata = "Gasoline";
    public ArrayList<Item> isiBackpack = new ArrayList<Item>(); // bakal digunakan nanti setelah class Item dibuat
    public static int chapterAktif; // bakal digunakan nanti setelah class Chapter dibuat
    private static boolean gameOver = false;

    public void Player() {

        if (healthPoint == 0) {
            setGameOver();
        }
    }

    public void addKeTas(Item objectItem) {

    }

    public static void addMaxHP(int tambah) {
        maxHealthPoint += tambah;
    }

    public static void addMaxMP(int tambah) {
        maxManaPoint += tambah;
    }

    public static boolean isGameOver() {
        return gameOver;
    }

    public static void setGameOver() {
        gameOver = true;
    }

    public static void addStats(int index, int tambah) {
        stats[index] += tambah;
    }
}
