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
    private int fa=0;
    private int fs=0;
    private int fw=0;
    private int fd=0;
    public void act() 
    {

    hit ();
    int x = getX();
    int y = getY();

        if( Greenfoot.isKeyDown( "right" ) ){
        setRotation(0);
        move(4);
        
    }
     if( Greenfoot.isKeyDown( "left" ) ){
        setRotation(180);
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
    
    if(fs == 0){
    if( Greenfoot.isKeyDown( "s" ) ){
        getWorld().addObject( new bullets(), x, y );
        fs=1;
    }
    }
    if(fa == 0){
    if( Greenfoot.isKeyDown( "a" ) ){
        getWorld().addObject( new bulleta(), x, y );
        fa=1;
    }
    }

    if(fw == 0){
    if( Greenfoot.isKeyDown( "w" ) ){
        getWorld().addObject( new bulletw(), x, y );
        fw=1;
    }
    }

    if(fd == 0){
    if( Greenfoot.isKeyDown( "d" ) ){
        getWorld().addObject( new bulletd(), x, y );
        fd=1;
    }
    }
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
