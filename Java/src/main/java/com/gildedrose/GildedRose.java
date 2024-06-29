package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            updateItemQuality(item);
        }
    }

        private void updateItemQuality(Item item ) {
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstage(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    break;
                default:
                    if (item.name.contains("Conjured")) {
                        updateConjuredItem(item);
                    } else {
                        updateNormalItem(item);
                    }
                    break;

            }
        }

            private void updateAgedBrie(Item item) {
                if (item.quality < 50 || item.sellIn < 0 && item.quality < 50) {
                    item.quality += 1;
                }
            }

            private void updateBackstage (Item item) {
                if (item.quality < 50 || item.sellIn < 11 || item.sellIn < 6) {
                    item.quality += 1;
                }
                if (item.sellIn < 0) {
                    item.quality = 0;
                }
            }

            private void updateNormalItem(Item item){
                    if (item.quality < 0 || item.sellIn < 0 && item.quality > 0) {
                        item.quality -= 1;
                    }
                }
             private void updateConjuredItem (Item item)  {
                        if(item.quality > 0 || item.sellIn < 0 && item.quality > 0){
                            item.quality -= 2;
                        }

                    }

}

