import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends firstTank
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean remove;
    private GreenfootImage image;
    private int angle;
    GreenfootSound shootingSound = new GreenfootSound ("GunShotSound.mp3");
    
    public Bullet(int angle)
    {
        super(angle);
        this.angle = angle;
    }
    
    public void act() 
    {
        
    }
    public void shootBullet(int angle)
    {
        image = new GreenfootImage ("BulletModel.png");
        setImage(image);
        setRotation(angle);
        remove = false;
   
 
    }
    public void shot(int angle,int x, int y)
    {
  
        image = new GreenfootImage ("BulletModel.png");
        setImage(image);
        setRotation(angle);
        shootingSound.play();
        //remove = false;
   
    }
    
    
        
}
