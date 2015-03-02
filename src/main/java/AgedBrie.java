public class AgedBrie implements ItemUpdater {
    public static final String NAME = "Aged Brie";

    protected Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0 && item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }
    }
}