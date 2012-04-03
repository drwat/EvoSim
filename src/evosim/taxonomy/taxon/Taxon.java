package evosim.taxonomy.taxon;

import evosim.taxonomy.RankEnum;
import evosim.taxonomy.TaxaTree;

/**
 * @author WooLooWoo
 */

public abstract class Taxon {
    public final RankEnum rank;
    public final String name;
    public final Taxon parentTaxon;
    public final TaxaTree childrenTaxa;
    public final long birthDate;

    public Taxon(final RankEnum rank, final Taxon parentTaxon, final String name) {
        this.rank = rank;
        this.parentTaxon = parentTaxon;
        this.name = name;
        this.birthDate = System.currentTimeMillis();
        this.childrenTaxa = new TaxaTree(this);
    }

}
