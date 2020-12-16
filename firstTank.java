import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TankBattle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class firstTank extends Actor
{
    private GreenfootImage image;
   
    public int angle;
    /**
     * Act - do whatever the TankBattle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public firstTank(int direction)
    {
        setRotation(direction);
        image = new GreenfootImage("TankModel.png");
        setImage(image);
        this.angle = direction;
    }
    
    
    public void act() 
    {
        // Add your action code here.
        Bullet bul = new Bullet(angle);
        movingTank();
        if (Greenfoot.isKeyDown("space"))
        {
            move(20);
            bul.shot(angle,getX(),getY());
            
        }
       
        /*
        
        bul.shootBullet(degrees);
        */
     
        
    }
    
    //Using "up" and "down" to move forward and backward,
    //      "left" and "right" to control the direction
    public void movingTank()
    {
        
        if (Greenfoot.isKeyDown("up"))
        {
            move(8);
        }
        else if (Greenfoot.isKeyDown("down"))
        {
            move(-8);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-30);
            angle-=30;
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(30);
            angle+=30;
        }
        
    }
    
    
    
    
    
    //shoot the bullet until "space" is pressed
    
}
