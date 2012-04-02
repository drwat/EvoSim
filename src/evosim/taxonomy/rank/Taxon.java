package evosim.taxonomy.rank;

import java.util.;

/**
 * @author WooLooWoo
 */

public abstract class Taxon {
    public final Object taxa;
    public final RankType rank;
    public final String name;
    private long age = 0l;

    public Taxon(RankType rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    public final long getAge() {
        return this.age;
    }

}
