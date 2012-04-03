package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Order extends Taxon {

    public Order(final TaxonClass parentClass, final String name) {
        super(RankEnum.ORDER, parentClass, name);
    }

}
