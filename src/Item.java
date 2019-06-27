public class Item {
    private String idItem;
    private String descItem;
    private int jenisItem; // 1 = consumable, 2 = usable
    private int effectItem;
    private int valueEffect;

    public Item(String id, String desc, int jenis) {
        this.idItem = id;
        this.descItem = desc;
        this.jenisItem = jenis;
    }

    public void setEffectItem(int effectItem) {
        this.effectItem = effectItem;
    }

    public void setValueEffect(int valueEffect) {
        this.valueEffect = valueEffect;
    }

    public String getIdItem() {
        return idItem;
    }

    public String getDescItem() {
        return descItem;
    }

    public int getJenisItem() {
        return jenisItem;
    }

    public int getEffectItem() {
        return effectItem;
    }

    public int getValueEffect() {
        return valueEffect;
    }

    public void aksi() {

    }
}
