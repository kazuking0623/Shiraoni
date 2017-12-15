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
    private int rtime;
    public void act()
    {
        rtime--;
        showText( "rtime = " + rtime, 300, 50 );
        if( rtime == 0 ){
                   showText( "ゲームオーバー", 100, 50 );
                   Greenfoot.stop();
        }  
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        rtime = 1000;
    }
}
