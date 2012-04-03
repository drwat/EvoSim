package evosim;

import evosim.buildingblocks.genetic.Gene;
import evosim.buildingblocks.genetic.Chromosome;
import evosim.buildingblocks.types.*;
import evosim.taxonomy.taxon.Taxon;

/**
 * @author WooLooWoo
 */

public class EvoSim {
    /**
     * Molecular and Atomic Objects
     */
        private ElementType elementTypes;
        private int totalAtoms;
        private int usedAtoms;

        private MoleculeType moleculeTypes;
        private int totalMolecules;
        private int usedMolecules;

        private ProteinType proteinTypes;
        // Total number of protein objects is not stored
        private EnzymeType enzymeTypes;
        // Total number of enzyme objects is not stored

        private NutrientType nutrientTypes;
        // Total number of nutrient objects is not stored

        /**
         * Genetics-related Objects
         */
            private AminoAcidType aminoAcidTypes;
            // Total number of amino acid objects is not stored
            private Gene[] genes;
            // Total number of amino acid objects is not stored
            private Chromosome[] chromosomes;
            // Total number of chromosomes is not stored

    /**
     * Cellular Objects
     */
        private OrganelleType organelleTypes;
        private CellType cellTypes;

    private Taxon[] taxa;
    // Should be stored as a tree of some sort

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printParams();
    }

    private static void printParams() {

    }

}
