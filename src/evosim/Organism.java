package evosim;

import evosim.genetics.VidiGenetics;
import evosim.taxonomy.taxon.Species;
import java.util.ArrayList;

/**
 * @param <_Species>
 * @author WooLooWoo
 */

public class Organism<_Species> {
    private java.awt.Point location;
    private final long birthDate;
    public final Species species;
    private final ArrayList<Organism<_Species>> parents;
    private VidiGenetics genetics;

    public Organism(Species species, ArrayList<Organism<_Species>> parents) {
        this.species = species;
        this.parents = parents;
        this.birthDate = System.currentTimeMillis();
    }

}