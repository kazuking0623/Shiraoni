import greenfoot.*;

/**
 * Write a description of class tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tank extends Actor
{
    /**
     * Act - do whatever the tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(180);
        move(3);
    }
     if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(0);
        move(3);
    }
     if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(270);
        move(3);
    }
     if( Greenfoot.isKeyDown( "up" ) ){
        setRotation(90);
        move(3);
    }
    }    
}
