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
        showText( "残り時間  " + rtime, 300, 50 );
        if( rtime == 0 ){
                   World c = new gameover();
                   Greenfoot.setWorld(c);
                   Greenfoot.stop();
        }  
    } 
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1080, 810, 1);    
        addObject( new tank(), 540, 405 );
        
        for(int i=0;i<10;i++){
        int Xmin = 0;
        int Xmax = 600;
        int X = Xmin + (int)(Math.random()*((Xmax-Xmin)+1));
        
        int Ymin = 0;
        int Ymax = 400;
        int Y = Ymin + (int)(Math.random()*((Ymax-Ymin)+1));
        
        addObject( new oni(), X,Y );

        rtime = 1000;

    }
}
}
