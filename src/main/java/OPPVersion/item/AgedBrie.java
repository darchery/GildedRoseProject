package OPPVersion.item;

import OPPVersion.UpdatableItem;

public class AgedBrie extends UpdatableItem {
    public static final String AGED_BRIE = "Aged Brie";

    public AgedBrie(String name,int sellIn, int quality) {
        super(AGED_BRIE, sellIn, quality);
    }

    @Override
    public void updateItem() {
        updateQuality();
        updateSellIn();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
    }

    @Override
    protected void updateSellIn() {
        decreaseSellIn();
        if (isNegativeSellIn()){
            increaseQuality();
        }
    }
}
