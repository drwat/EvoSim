package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Genus extends Taxon {

    public Genus(final Family parentFamily, final String name) {
        super(RankEnum.GENUS, parentFamily, name);
    }

}