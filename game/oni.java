import greenfoot.*;

/**
 * Write a description of class oni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class oni extends Actor
{
    /**
     * Act - do whatever the oni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        for(int i=0;i<5;i++){
        int Xmin = 0;
        int Xmax = 10;
        int X = Xmin + (int)(Math.random()*((Xmax-Xmin)+1));
        
        int Ymin = 0;
        int Ymax = 360;
        int Y = Ymin + (int)(Math.random()*((Ymax-Ymin)+1));
        move(X);
        setRotation(Y);
        
    }

        }
}
