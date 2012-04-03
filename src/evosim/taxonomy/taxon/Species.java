package evosim.taxonomy.taxon;

import evosim.genetics.SpeciesGenetics;
import evosim.taxonomy.RankEnum;

/**
 * @author WooLooWoo
 */

public final class Species extends Taxon {
    private int population;
    private SpeciesGenetics genetics;

    public Species(final Genus parentGenus, final String name) {
        super(RankEnum.SPECIES, parentGenus, name);
    }

}