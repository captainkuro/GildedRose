public class Conjured implements ItemUpdater {
    public static final String NAME = "Conjured Mana Cake";

    protected Item item;

    public Conjured(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(item.getQuality() - 4);
        } else {
            item.setQuality(item.getQuality() - 2);
        }

        if (item.getQuality() < 0) {
            item.setQuality(0);
        }
    }
}