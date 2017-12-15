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
<<<<<<< HEAD

=======
>>>>>>> 7b5d5b606e51466cb068d2daa8aab772d6c25a15
        
        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(1);
    }

        // Add your action code here.
<<<<<<< HEAD

=======
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> 7b5d5b606e51466cb068d2daa8aab772d6c25a15
=======
>>>>>>> b409fdb15354dd1e996bead9527680e85d54faeb
        if( Greenfoot.isKeyDown( "down" ) ){
        setRotation(90);
        move(5);
         }
<<<<<<< HEAD

=======
=======
<<<<<<< HEAD
>>>>>>> 0111226f745f27e5bc5c45c09d9913fec7d281c9
=======
<<<<<<< HEAD
>>>>>>> b409fdb15354dd1e996bead9527680e85d54faeb
        if( Greenfoot.isKeyDown( "up" ) ){
            setRotation(270);
            move(1);
}
    }    
}
