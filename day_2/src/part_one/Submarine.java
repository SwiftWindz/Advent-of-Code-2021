package day_2.src.part_one;

/**
 * Submarine class for Advent of Code 2021 day 2 Part One
 * https://adventofcode.com/2021/day/2#part2
 *  @author Phil Ganem
 */
public class Submarine {

    // Depth of the submarine
    private int depth;
    // Current horizontal position of the submarine
    private int hor_pos;

    /**
     * Constructor for the submarine
     */
    public Submarine() {
        this.depth = 0;
        this.hor_pos = 0;
    }

    /**
     * Decreases the depth of the submarine by param
     * @param decrease
     */
    public void decreaseDepth(int decrease) {
        this.depth -= decrease;
       
    }

    /**
     * Increases the depth of the submarine by param
     * @param increase
     */
    public void increaseDepth(int increase) {
        this.depth += increase;
    }

    /**
     * Decreases the horizontal position of the submarine by param
     * @param decrease
     */
    public void decreaseHorPos(int decrease) {
        this.hor_pos -= decrease;
    }

    /**
     * Increases the horizontal position of the submarine by param
     * @param increase
     */
    public void increaseHorPos(int increase) {
        this.hor_pos += increase;
    }

// Getters and Setters
  
    public int getDepth() {
        return this.depth;
    }

    public int getHorPos() {
        return this.hor_pos;
    }
}
