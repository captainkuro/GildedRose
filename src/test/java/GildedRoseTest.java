import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void testTheTruth() {
        assertTrue(true);
    }

    @Test
    public void NormalUpdateQuality_SellInMoreThanZero_QualityMinusOne() {
        Item item = new Item("+5 Dexterity Vest", 10, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 19);
    }

    @Test
    public void NormalUpdateQuality_SellInZero_QualityMinusTwo() {
        Item item = new Item("+5 Dexterity Vest", 0, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 18);
    }

    @Test
    public void NormalUpdateQuality_QualityIsZero_QualityNotNegative() {
        Item item = new Item("+5 Dexterity Vest", 0, 0);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 0);
    }

    @Test
    public void AgedBrieUpdateQuality_SellInMoreThanZero_QualityPlusOne() {
        Item item = new Item("Aged Brie", 2, 0);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 1);
    }

    @Test
    public void AgedBrieUpdateQuality_SellInZero_QualityPlusTwo() {
        Item item = new Item("Aged Brie", 0, 0);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 2);
    }

    @Test
    public void AgedBrieUpdateQuality_QualityIsFifty_QualityStillFifty() {
        Item item = new Item("Aged Brie", 0, 50);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 50);
    }

    @Test
    public void SulfurasUpdateQuality_SellInAnyValue_QualityDoesntChange() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 80);
    }

    @Test
    public void BackstagePassesUpdateQuality_SellInMoreThanTen_QualityPlusOne() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 21);
    }

    @Test
    public void BackstagePassesUpdateQuality_SellInBetweenSixAndTen_QualityPlusTwo() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 22);
    }

    @Test
    public void BackstagePassesUpdateQuality_SellInFiveOrLess_QualityPlusThree() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 23);
    }

    @Test
    public void BackstagePassesUpdateQuality_SellInZero_QualityIsZero() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 0);
    }

    @Test
    public void ConjuredUpdateQuality_SellInMoreThanZero_QualityMinusTwo() {
        Item item = new Item("Conjured Mana Cake", 3, 6);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 4);
    }

    @Test
    public void ConjuredUpdateQuality_SellInZero_QualityMinusFour() {
        Item item = new Item("Conjured Mana Cake", 0, 6);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 2);
    }

    @Test
    public void ConjuredUpdateQuality_QualityIsZero_QualityNotNegative() {
        Item item = new Item("Conjured Mana Cake", 0, 0);
        SortingHat.assign(item).updateQuality();
        assertTrue(item.getQuality() == 0);
    }
}
