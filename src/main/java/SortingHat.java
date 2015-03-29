public class SortingHat {
    private enum ItemType {
        AGED_BRIE("AgedBrie", "Aged Brie"),
        BACKSTAGE_PASSES("BackstagePasses", "Backstage passes to a TAFKAL80ETC concert"),
        SULFURAS("Sulfuras", "Sulfuras, Hand of Ragnaros"),
        CONJURED("Conjured", "Conjured Mana Cake"),
        NORMAL("Normal", "");
        
        private final String className;
        private final String itemName;
        
        private ItemType(String className, String itemName) {
            this.className = className;
            this.itemName = itemName;
        }
        
        private static ItemType matches(Item item) {
            for (ItemType t : ItemType.values()) {
                if (t.itemName.equals(item.getName())) {
                    return t;
                }
            }
            return NORMAL;
        }
    }
    public static ItemUpdater assign(Item item) {
        ItemType type = ItemType.matches(item);
        try {
            return (ItemUpdater)Class.forName(type.className)
                    .getDeclaredConstructor(Item.class)
                    .newInstance(item);
        } catch(Exception ex) {
            return new Normal(item);
        }
    }
}