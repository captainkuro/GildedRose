public class SortingHat {
    public static ItemUpdater assign(Item item) {
        if ("Aged Brie".equals(item.getName())) {
            return new AgedBrie(item);
        } else if ("Backstage passes to a TAFKAL80ETC concert".equals(item.getName())) {
            return new BackstagePasses(item);
        } else if ("Sulfuras, Hand of Ragnaros".equals(item.getName())) {
            return new Sulfuras(item);
        } else if ("Conjured Mana Cake".equals(item.getName())) {
            return new Conjured(item);
        } else {
            return new Normal(item);
        }
    }
}