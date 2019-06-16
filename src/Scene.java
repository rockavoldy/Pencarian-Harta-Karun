import java.util.ArrayList;

public class Scene {
    private Player objectPlayer;
    public String narasi;
    public String itemBisaDigunakan;
    protected ArrayList<Pilihan> arrPilihan = new ArrayList<Pilihan>(); // tampung semua pilihan

    protected void Scene() {

        // hapus pilihan buka backpack
//        PilihanTas objectTas = new PilihanTas(this);
//        addPilihan(objectTas);
    }

    public void addPilihan(Pilihan objectPilihan) {
        arrPilihan.add(objectPilihan);
    }

    protected void sceneMain() {

    }
}
