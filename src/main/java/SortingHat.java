public class SortingHat {
    public static ItemUpdater assign(Item item) {
        if (AgedBrie.NAME.equals(item.getName())) {
            return new AgedBrie(item);
        } else if (BackstagePasses.NAME.equals(item.getName())) {
            return new BackstagePasses(item);
        } else if (Sulfuras.NAME.equals(item.getName())) {
            return new Sulfuras(item);
        } else if (Conjured.NAME.equals(item.getName())) {
            return new Conjured(item);
        } else {
            return new Normal(item);
        }
    }
}