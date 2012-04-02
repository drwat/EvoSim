package evosim;

import evosim.taxonomy.rank.Taxon;
import evosim.taxonomy.rank.RankType;

/**
 * @author WooLooWoo
 */

public class Organism {
    public final Taxon taxon;
    private java.awt.Point location;
    private int age;

    public Organism(Taxon taxon) {
        this.taxon = taxon;
    }

}