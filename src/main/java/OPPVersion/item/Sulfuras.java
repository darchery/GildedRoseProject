package OPPVersion.item;

import OPPVersion.UpdatableItem;

public class Sulfuras extends UpdatableItem {
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public Sulfuras(int sellIn, int quality) {
        super(SULFURAS, sellIn, quality);
    }

    public Sulfuras() {
        super(SULFURAS, sellIn, quality);
    }

    @Override
    public void updateItem() {
        // Sulfuras doenst`s change
    }

    @Override
    protected void updateQuality() {
        // Sulfuras doenst`s change
    }

    @Override
    protected void updateSellIn() {
        // Sulfuras doenst`s change
    }
}
