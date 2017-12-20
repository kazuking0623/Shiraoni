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
    private int oni;
    public void act() 
    {
    hit ();
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
    
        // Add your action code here.
    } 
        public void hit()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, oni.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            oni++;
            getWorld().showText( "捕まえた数"+oni, 100, 50 );
            if(oni == 3){
                   getWorld().showText( "Clear !", 100, 50 );
                   Greenfoot.stop();
                }
            // TARO とぶつかった時の処理を書く
        }  
    }
    

    }    
