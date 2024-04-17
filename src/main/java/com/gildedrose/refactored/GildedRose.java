package com.gildedrose.refactored;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final int MAX_QUALITY = 50;
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {

            if (isAgedBrie(item)) {
                // Quality
                if (item.quality < MAX_QUALITY) {
                    item.quality = item.quality + 1;
                }
                // sellIn
                decreaseSellIn(item);
                if (isNegativeSellIn(item)) {
                    increaseQuality(item);
                }
            } else if (isBackStagePass(item)) {
                // Quality
                if (item.quality < MAX_QUALITY) {
                    item.quality = item.quality + 1;

                    if (isBackStagePass(item)) {
                        sellInLowerThanX(item, 11);
                        sellInLowerThanX(item, 6);
                    }
                }
                // sellIn
                decreaseSellIn(item);
                if (isNegativeSellIn(item)) {
                    item.quality = 0;
                }
            } else if (isSulfuras(item)) {

            } else {
                // Default case, regular item
                if (!isNegativeSellIn(item)) {
                    item.quality = item.quality - 1;
                }

                if (item.sellIn == 0) {
                    item.quality = item.quality - 1;

                }
            }
        }
    }


    private static void decreaseSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
    private static boolean isNegativeSellIn(Item item) {
        return item.sellIn < 0;
    }

    private static boolean isPositiveQuality(Item item) {
        return item.quality > 0;
    }

    private static boolean isSulfuras(Item item) {
        return item.name.equals(SULFURAS);
    }

    private static boolean isBackStagePass(Item item) {
        return item.name.equals(BACKSTAGE_PASS);
    }

    private static boolean isAgedBrie(Item item) {
        return item.name.equals(AGED_BRIE);
    }

    private static void sellInLowerThanX(Item item, int x) {
        if (item.sellIn < x) {
            increaseQuality(item);
        }
    }

    private static void increaseQuality(Item item) {
        if (item.quality < MAX_QUALITY) {
            item.quality = item.quality + 1;
        }
    }
}