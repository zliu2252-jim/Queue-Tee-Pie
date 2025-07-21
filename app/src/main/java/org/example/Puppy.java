package org.example;

/**
 * This class implements the Cutie interface.
 * It represents a "cute" object—specifically, a puppy with a description and cuteness rating.
 */
public class Puppy implements Cutie {

    /**
     * Returns a description about what makes this puppy cute.
     *
     * @return a String describing the puppy's cute
     */
    @Override
    public String description() {
        return "A little puppy with big, sad eyes";
    }

    /**
     * Returns the cuteness rating of this puppy.
     *
     * @return an Integer representing the puppy's cuteness rating
     */
    @Override
    public Integer cutenessRating() {
        return 12;
    }
}