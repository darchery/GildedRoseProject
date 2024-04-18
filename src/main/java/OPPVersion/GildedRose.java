package OPPVersion;

class GildedRose {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final int MAX_QUALITY = 50;
    UpdatableItem[] items;

    public GildedRose(UpdatableItem[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (UpdatableItem item : items) {
            item.updateItem();
        }
    }
}