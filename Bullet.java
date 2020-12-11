import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends TankBattle
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        int count = 0;
        int waitingTime = 0;
        if (Greenfoot.isKeyDown("x"))
        {
            shootBullet(degrees);
            move(20);
            count++;
            
            
        }
    }
    public void shootBullet(int angle)
    {
        
        Bullet bullet = new Bullet();
        MyWorld world = (MyWorld) getWorld();
        world.addObject(bullet,getX()+20,getY());
        
        setRotation(angle);
        move(20);
            
        
    }
}
