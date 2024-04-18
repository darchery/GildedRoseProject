package OPPVersion;

public abstract class UpdatableItem extends Item{

    private static final int MAX_QUALITY = 50;

    public UpdatableItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    public abstract void updateItem();
    protected abstract void updateQuality();
    protected abstract void updateSellIn();

    protected static boolean isPositiveQuality() {
        return quality > 0;
    }
    protected static boolean isNegativeSellIn() {
        return sellIn < 0;
    }
    protected static void decreaseSellIn() {
        sellIn = sellIn - 1;
    }
    protected static void increaseQuality() {
        if (quality < MAX_QUALITY) {
            quality = quality + 1;
        }
    }
    protected static void sellInLowerThanX(int x) {
        if (sellIn < x) {
            increaseQuality();
        }
    }
}




