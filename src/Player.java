import java.util.ArrayList;

public class Player {
    private int maxHealthPoint = 0;
    private int maxManaPoint = 0;
    private int[] stats; // berturut-turut VIT, STR, INT, AGI
    private int healthPoint = 0;
    private int manaPoint = 0;
    private Senjata usedSenjata;
    private int defaultAttack = 10;
    private ArrayList<Item> isiBackpack = new ArrayList<>();
    private int chapterAktif;
    private static boolean gameOver = false;

    public Player(int[] arrStats, Senjata senjata, int chapter) {
        this.stats = arrStats;
        int defaultHP = 80;
        int defaultMP = 60;
        usedSenjata = senjata;
        chapterAktif = chapter;

        addMaxStatus("HP", (defaultHP + ((this.stats[0] / 3) * 6)));
        addMaxStatus("MP", (defaultMP + ((this.stats[2] / 2) * 4)));
    }

    public void incChapter() {
        chapterAktif++;
    }

    public int getChapter() {
        return chapterAktif;
    }

    public void addKeTas(Item objectItem) {
        isiBackpack.add(objectItem);
    }

    public void gunakanItem(String idItem) {
        Item item = null;
        int itemIndex = -1;
        for (int i = 0; i < isiBackpack.size(); i++) {
            if (isiBackpack.get(i).getIdItem().equals(idItem)) {
                item = isiBackpack.get(i);
                itemIndex = i;
                break;
            }
        }
        if (item.getJenisItem() == 1) {
            item.aksi();
        }

        isiBackpack.remove(itemIndex);


    }

    public int getMaxStatus(String status) {
        int ret = 0;
        switch (status) {
            case "HP":
                ret = maxHealthPoint;
                break;
            case "MP":
                ret = maxManaPoint;
                break;
            default:
                System.out.println("Gagal get maxStatus "+status);
        }

        return ret;
    }

    public void addMaxStatus(String status, int tambah) {
        switch (status) {
            case "HP":
                maxHealthPoint += tambah;
                healthPoint = maxHealthPoint;
                break;
            case "MP":
                maxManaPoint += tambah;
                manaPoint = maxManaPoint;
                break;
            default:
                System.out.println("Gagal add max status "+status);
        }
    }

    public int getStatus(String status) {
        int ret = 0;
        switch (status) {
            case "HP":
                ret = healthPoint;
                break;
            case "MP":
                ret = manaPoint;
                break;
            default:
                System.out.println("Gagal get status "+status);
        }

        return ret;
    }

    public void addStatus(String status, int tambah) {
        switch (status) {
            case "HP":
                healthPoint += tambah;
                break;
            case "MP":
                manaPoint += tambah;
                break;
            default:
                System.out.println("Gagal tambah status "+status);
        }
    }

    public void subStatus(String status, int kurang) {
        switch (status) {
            case "HP":
                healthPoint -= kurang;
                break;
            case "MP":
                manaPoint -= kurang;
                break;
            default:
                System.out.println("Gagal substract status "+status);
        }
    }

    public static boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver() {
        gameOver = true;
        ThreadGUI.createGameOverScreen();
    }

    public void checkGameOver() {
        if (healthPoint == 0) {
            setGameOver();
        }
    }

    public void addStats(int index, int tambah) {
        stats[index] += tambah;
        if (index == 0) {
            addMaxStatus("HP", (healthPoint + ((this.stats[0] / 3) * 6)));
        } else if (index == 2) {
            addMaxStatus("MP", (manaPoint + ((this.stats[2] / 2) * 4)));
        } else if (index == 1) {
            setAttack(defaultAttack + (defaultAttack * ((this.stats[1] / 3) * 10) / 100));
        }
    }

    public String getUsedSenjata () {
        return usedSenjata.getNamaSenjata();
    }

    public void setUsedSenjata(Senjata senjata) {
        usedSenjata = senjata;
    }

    public int getAttack() {
        int att = defaultAttack + (defaultAttack * ((this.stats[1] / 3) * 10) / 100);
        return (att + usedSenjata.getKekuatanSenjata());
    }

    public void setAttack(int attack) {
        int att = defaultAttack + attack;
    }
}
