package day_2.src.part_two;

/**
 * Submarine class for Advent of Code 2021 day 2 Part Two
 * https://adventofcode.com/2021/day/2#part2
 *  @author Phil Ganem
 */
public class Submarine {

    // Depth of the submarine
    private int depth;
    // Current horizontal position of the submarine
    private int hor_pos;
    // Current "aim" of the submarine
    private int aim;

    /**
     * Constructor for the submarine
     */
    public Submarine() {
        this.depth = 0;
        this.hor_pos = 0;
        this.aim = 0;
    }

    /**
     * Decreases the aim of the submarine by param
     * @param decrease
     */
    public void decreaseDepth(int decrease) {
        this.aim -= decrease;
       
    }

    /**
     * Increases the aim of the submarine by param
     * @param increase
     */
    public void increaseDepth(int increase) {
        this.aim += increase;
    }

    /**
     * Decreases the horizontal position of the submarine by param
     * @param decrease
     */
    public void decreaseHorPos(int decrease) {
        this.hor_pos -= decrease;
    }

    /**
     * Increases the horizontal position of the submarine by param and increases 
     * depth by multiplying param and aim
     * @param increase
     */
    public void increaseHorPos(int increase) {
        this.hor_pos += increase;
        this.depth += this.getAim() * increase;
    }

// Getters and Setters
  
    private int getAim() {
        return this.aim;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getHorPos() {
        return this.hor_pos;
    }
}
