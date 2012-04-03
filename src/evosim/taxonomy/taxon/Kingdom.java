package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Kingdom extends Taxon {

    public Kingdom(final Domain parentDomain, final String name) {
        super(RankEnum.KINGDOM, parentDomain, name);
    }

}
