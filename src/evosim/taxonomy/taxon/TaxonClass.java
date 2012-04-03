package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class TaxonClass extends Taxon {

    public TaxonClass(final Phylum parentPhylum, final String name) {
        super(RankEnum.CLASS, parentPhylum, name);
    }

}
