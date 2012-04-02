package evosim.taxonomy;

import evosim.taxonomy.rank.*;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author WooLooWoo
 */

public abstract class Taxonomy {
    private Collection<Domain> domains;
    private Collection<Kingdom> kingdoms;
    private Collection<Phylum> phyla;
    private Collection<TxClass> classes;
    private Collection<Order> orders;
    private Collection<Family> families;
    private Collection<Genus> genera;
    private ArrayList<Species> species;

    public static Domain createDomain(Taxon taxon) {
        return null;
    }

    public static Kingdom createKingdom(Taxon taxon) {
        return null;
    }

    public static Phylum createPhylum(Taxon taxon) {
        return null;
    }

    public static TxClass createClass(Taxon taxon) {
        return null;
    }

    public static Order createOrder(Taxon taxon) {
        return null;
    }

    public static Family createFamily(Taxon taxon) {
        return null;
    }

    public static Genus createGenus(Taxon taxon) {
        return null;
    }

    public static Species createSpecies(Taxon taxon) {
        return null;
    }

    /*
     * Getters
     */

    public Species getSpeciesObject(String name) {
        int i = 0;
        int length = species.size();

        while (i < length)
    }

}