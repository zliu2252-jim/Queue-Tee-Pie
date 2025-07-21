package org.example;

/**
 * The Kitty class implements the Cutie interface.
 * It represents a cute kitten object with own description and cuteness rating.
 * */
public class Kitty implements Cutie {

    /**
     * Returns a description of what makes this kitty cute.
     *
     * @return a String describing the kitty's cute qualities
     */
    @Override
    public String description() {
        return "A Kitty run around the house.";
    }

    /**
     * Returns the cuteness rating of this kitty.
     *
     * @return an Integer representing the kitty's cuteness rating
     */
    @Override
    public Integer cutenessRating() {
        return 11;
    }
}