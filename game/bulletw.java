import greenfoot.*;

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bulletw extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int h=0;
    public void act() 
    {
        int i;
        if(h==0){
        if( Greenfoot.isKeyDown( "w" ) ){
            h=1;
        for(i=0;i<1000;i++){
        setRotation(270);
        move(5);
    }
    
    }
        
        
        if( Greenfoot.isKeyDown( "left" ) ){
            setRotation(180);
            move(4);
        }
        if( Greenfoot.isKeyDown( "right" ) ){
            setRotation(0);
            move(4);
        }
        if( Greenfoot.isKeyDown( "down" ) ){
            setRotation(90);
            move(4);
        }
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(4);
        }
    }
    }    
}
