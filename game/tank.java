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
        oni = 0;
        // Add your action code here.
    } 
        public void hit()
    {
               Actor actor = getOneObjectAtOffset( 0, 0, oni.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            oni++;
            if(oni == 3){
                   getWorld().showText( "Clear !", 100, 50 );
                   Greenfoot.stop();
                }
            // TARO とぶつかった時の処理を書く
        }  
    }
}
