import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        
        
        for(int i=0;i<3;i++){
        int Xmin = 0;
        int Xmax = 600;
        int X = Xmin + (int)(Math.random()*((Xmax-Xmin)+1));
        
        int Ymin = 0;
        int Ymax = 400;
        int Y = Ymin + (int)(Math.random()*((Ymax-Ymin)+1));
        
        addObject( new oni(), X,Y );
    }
}
}