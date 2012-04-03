package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Domain extends Taxon {

    public Domain(final Life parentLife, final String name) {
        super(RankEnum.DOMAIN, parentLife, name);
    }

}
