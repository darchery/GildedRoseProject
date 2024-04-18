package OPPVersion.item;

import OPPVersion.UpdatableItem;

public class Conjured extends UpdatableItem {
    public static final String CONJURED = "Conjured";

    public Conjured(String name, int sellIn, int quality) {
        super(CONJURED, sellIn, quality);
    }

    @Override
    public void updateItem() {
        updateQuality();
        updateSellIn();
    }
    @Override
    protected void updateQuality() {
        decreaseQuality();
        decreaseQuality();
    }

    @Override
    protected void updateSellIn() {
        if (sellIn == 0) {
            decreaseQuality();
            decreaseQuality();
            decreaseQuality();
            decreaseQuality();
        }
        else {
            decreaseSellIn();
        }
    }
}
