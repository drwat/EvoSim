package evosim.taxonomy.rank;

import evosim.Organism;
import java.util.Collection;

/**
 * @author WooLooWoo
 */

public final class Species extends Taxon {
    private Collection<Organism> population;
    private int livingPopulation;
    private int deadPopulation;

    public Species(final String name) {
        super(RankType.SPECIES, name);
    }

    public Organism newOrganism() {
        return new Organism(this);
    }

    public final String getTaxonomicName(int numRanks) {
        String txName = "";
        String[] names = this.taxa.values().toArray(new String[this.taxa.size()]);

        if (numRanks >= names.length) {
            numRanks = names.length - 1;
        } else if (numRanks <= 0) {
            return names[0];
        }

        int i = 0;
        while (numRanks >= 0) {
            txName += names[numRanks--] + " ";
        }

        return txName.trim();
    }

}
