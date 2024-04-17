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

          if (!isAgedBrie(item) && !isBackStagePass(item)) {
              if (item.quality > 0) {

                  if (!isSulfuras(item)) {
                      item.quality = item.quality - 1;
                  }

              }

          } else {

              if (item.quality < MAX_QUALITY) {
                  item.quality = item.quality + 1;

                  if (isBackStagePass(item)) {
                    sellInLowerThanX(item, 11);
                    sellInLowerThanX(item, 6);
                  }
              }
          }

          if (!isSulfuras(item)) {
              item.sellIn = item.sellIn - 1;
          }

          if (item.sellIn < 0) {

              if (!isAgedBrie(item)) {

                  if (!isBackStagePass(item)) {

                      if (item.quality > 0) {

                          if (!isSulfuras(item)) {
                              item.quality = item.quality - 1;
                          }
                      }

                  } else {
                      item.quality = 0;
                  }
              } else {
                increaseQuality(item);
              }
          }
      }

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