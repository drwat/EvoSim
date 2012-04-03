package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public class Life extends Taxon {
    public enum LifeEnum {
        CELLULAR,
        VIRAL;
    }

    public final LifeEnum lifeType;

    public Life(final String name, final LifeEnum lifeType) {
        super(RankEnum.LIFE, null, name);
        this.lifeType = lifeType;
    }

}
