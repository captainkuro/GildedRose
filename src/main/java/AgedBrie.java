public class AgedBrie implements ItemUpdater {
    protected Item item;

    public AgedBrie(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            if (item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }
    }
}