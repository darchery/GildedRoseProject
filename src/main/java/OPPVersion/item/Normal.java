package OPPVersion.item;

import OPPVersion.UpdatableItem;

public class Normal extends UpdatableItem {

    public Normal(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateItem() {
        updateQuality();
    }

    @Override
    protected void updateQuality() {
        if (!isNegativeSellIn()) {
            quality = quality - 1;
        }
        if (sellIn == 0) {
            quality = quality - 1;
        }
    }

    @Override
    protected void updateSellIn() {

    }
}
