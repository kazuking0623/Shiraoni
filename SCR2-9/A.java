import greenfoot.*;

/**
 * Write a description of class A here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class A extends Actor
{
    /**
     * Act - do whatever the A wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

       if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
        move(1);
    }

        
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }

        // Add your action code here.
<<<<<<< HEAD

=======
<<<<<<< HEAD
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(1);
}
=======
>>>>>>> f318c74249d5b88ac7a380157a4197c35112f419
>>>>>>> 7e5440d0118493387b385b6b0af2fc32f2b7281a
>>>>>>> 9eef2567bcf4cf3481b3af3f655f1f3b0b3f28f7
    }    
}
