
/**
 * Write a description of class Piece here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Piece
{
    // instance variables - replace the example below with your own
    private int xCoord;
    private int yCoord;
    private char color;
    /**
     * Constructor for objects of class Piece
     */
    public Piece(int x, int y, char c)
    {
        // initialise instance variables
        xCoord = x;
        yCoord = y;
        color = c;
    }
    
    public abstract boolean Move(int x, int y);
    
}
