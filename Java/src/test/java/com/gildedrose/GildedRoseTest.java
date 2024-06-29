package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


@Test
void testRegularItemAfterSellIn() {
    Item[] items = new Item[] { new Item("foo", 0, 18) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals(0, app.items[0].sellIn);
    assertEquals(18, app.items[0].quality);
}

@Test
void testAgedBrieBeforeSellIn() {
    Item[] items = new Item[] { new Item("Aged Brie", 10, 20) };
    GildedRose app = new GildedRose(items);
    app.updateQuality();
    assertEquals(10, app.items[0].sellIn);
    assertEquals(21, app.items[0].quality);
}

@Test
    void testAgedBrieAfterSellIn() {
        Item[] items = new Item[] { new Item("Aged Brie", 0, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
    }

    @Test
    void testSulfuras() {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    void testBackstagePassesMoreThan10Days() {
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(15, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
    }

    @Test
    void testConjuredItemBeforeSellIn() {
        Item[] items = new Item[] { new Item("Conjured Mana Cake", 10, 20) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].sellIn);
        assertEquals(18, app.items[0].quality);
    }










}