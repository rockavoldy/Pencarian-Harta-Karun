public class ConsumableItem extends Item {
    public ConsumableItem(String id, String desc, int jenis, int effect, int value) {
        super(id, desc, jenis);
        this.setEffectItem(effect);
        this.setValueEffect(value);
    }

    public void aksi() {
        // effect
        // 1 = stats VIT
        // 2 = stats STR
        // 3 = stats INT

        switch (getEffectItem()) {
            case 1:
                ThreadGUI.objectPlayer.addStats(0, getValueEffect());
                break;
            case 2:
                ThreadGUI.objectPlayer.addStats(1, getValueEffect());
                break;
            case 3:
                ThreadGUI.objectPlayer.addStats(2, getValueEffect());
                break;
        }
    }
}
