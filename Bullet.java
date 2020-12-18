import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private boolean remove;
    private GreenfootImage image;
    private int angle;
    private int cooldown;
    
    public Bullet ()
    {
        
    }
    public Bullet(int angle)
    {
       
        this.angle = angle;
    }
    
    public void act() 
    {
        move(20);
        bouncingOffWall();
        removeBullet();
    }
    public void bouncingOffWall()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(90));
        }
    }
    
    public void removeBullet()
    {
        if(Tank.remove)
        {
            getWorld().removeObject(this);
        }
    }

   
    
    
    
        
}
