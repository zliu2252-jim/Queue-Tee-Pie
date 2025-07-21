package org.example;

/**
 * This class provides a description and a cuteness rating for the pygmy marmoset.
 */
public class PygmyMarmoset implements Cutie {

    /**
     * Returns a description of what makes this pygmy marmoset cute.
     *
     * @return a String describing the pygmy marmoset's adorable qualities
     */
    @Override
    public String description() {
        return "A cute Pygmy Marmoset is a tiny animal";
    }

    /**
     * Returns the cuteness rating of this pygmy marmoset.
     *
     * @return an Integer representing the pygmy marmoset's cuteness rating
     */
    @Override
    public Integer cutenessRating() {
        return 10;
    }
}