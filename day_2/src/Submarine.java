package day_2.src;

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

    public void decreaseDepth(int decrease) {
        this.depth -= decrease;
       
    }
    public void increaseDepth(int increase) {
        this.depth += increase;
    }

    public void decreaseHorPos(int decrease) {
        this.hor_pos -= decrease;
    }

    public void increaseHorPos(int increase) {
        this.hor_pos += increase;
    }

    public int getDepth() {
        return this.depth;
    }

    public int getHorPos() {
        return this.hor_pos;
    }
}
