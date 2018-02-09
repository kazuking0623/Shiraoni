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
    private int a;
    private int count;
    private int oni;

    public boolean moving(){ return (a==0); } 

    public void act() 
    {

        hita();
        hits();
        hitw();
        hitd();
        //hit();
        // getWorld().showText( "count = " + count, 500, 50 );
        // getWorld().showText( "a = " + a, 700, 50 );
        if(a==1){
            count--;
            if(count == 0){
                a = 0;
            }
        }
        else{
            
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

    public void hita()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, bulleta.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            a = 1;
            count = 200;
            // TARO とぶつかった時の処理を書く       
        }  
    }

    public void hitw()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, bulletw.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            a = 1;
            count = 200;
            // TARO とぶつかった時の処理を書く
        }  
    }

    public void hits()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, bullets.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            a = 1;
            count = 200;
            // TARO とぶつかった時の処理を書く
        }  
    }

    public void hitd()
    {
        Actor actor = getOneObjectAtOffset( 0, 0, bulletd.class );
        if( actor != null ){
            getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
            a = 1;
            count = 200;
            // TARO とぶつかった時の処理を書く
        }  
    }
    /*
    public void hit()
    {
    Actor actor = getOneObjectAtOffset( 0, 0, tank.class );
    if( actor != null ){
    getWorld().removeObject( actor ); // getWorld() は World オブジェクトの getter
    oni++;
    getWorld().showText( "捕まえた数"+oni, 100, 50 );
    if(oni == 10){
    getWorld().showText( "Clear !", 100, 50 );
    Greenfoot.stop();
    }
    // TARO とぶつかった時の処理を書く
    if (a != 1){

    World c = new gameover();
    Greenfoot.setWorld(c);
    Greenfoot.stop();

    }
    }  

    }
     */

}
