public class Senjata {
    private String idSenjata;
    private String namaSenjata;
    private int kekuatanSenjata;

    public Senjata(String idSenjata, String namaSenjata, int kekuatanSenjata) {
        this.idSenjata = idSenjata;
        this.namaSenjata = namaSenjata;
        this.kekuatanSenjata = kekuatanSenjata;
    }

    public String getIdSenjata() {
        return idSenjata;
    }

    public String getNamaSenjata() {
        return namaSenjata;
    }

    public int getKekuatanSenjata() {
        return kekuatanSenjata;
    }
}
