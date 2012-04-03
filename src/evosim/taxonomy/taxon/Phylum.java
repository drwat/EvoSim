package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Phylum extends Taxon {

    public Phylum(final Kingdom parentKingdom, final String name) {
        super(RankEnum.PHYLUM, parentKingdom, name);
    }

}
