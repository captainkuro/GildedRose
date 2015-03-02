public class BackstagePasses implements ItemUpdater {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    protected Item item;

    public BackstagePasses(Item item) {
        this.item = item;
    }

    public void updateQuality() {
        if (item.getQuality() < 50) {
            item.setQuality(item.getQuality() + 1);

            if (item.getSellIn() < 11 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }

            if (item.getSellIn() < 6 && item.getQuality() < 50) {
                item.setQuality(item.getQuality() + 1);
            }
        }

        item.setSellIn(item.getSellIn() - 1);

        if (item.getSellIn() < 0) {
            item.setQuality(0);
        }
    }
}