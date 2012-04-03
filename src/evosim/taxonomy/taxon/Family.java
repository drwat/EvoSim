package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Family extends Taxon {

    public Family(final Order parentOrder, final String name) {
        super(RankEnum.FAMILY, parentOrder, name);
    }

}
