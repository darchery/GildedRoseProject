package OPPVersion.item;

import OPPVersion.UpdatableItem;

public class BackStage extends UpdatableItem {
    public static final String BACKSTAGE_PASS = "Backstage passes to a TAFKAL80ETC concert";
    public BackStage(String name, int sellIn, int quality) {
        super(BACKSTAGE_PASS, sellIn, quality);
    }

    @Override
    public void updateItem() {
        updateQuality();
        updateSellIn();
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        sellInLowerThanX(11);
        sellInLowerThanX(6);
    }

    @Override
    protected void updateSellIn() {
        decreaseSellIn();
        if (isNegativeSellIn()) {
            quality = 0;
        }
    }
}
