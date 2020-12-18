import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TankBattle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{
    private GreenfootImage image;
    GreenfootSound shootingSound = new GreenfootSound ("GunShotSound.mp3");
    public int angle;
    private final int MAX_COOLDOWN = 60;
    private int tolerance;
    private int cooldown;
    private int numBullet;
    private boolean needToRefill = false;
    public static boolean remove = false;
    /**
     * Act - do whatever the TankBattle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Tank(int direction)
    {
        setRotation(direction);
        image = new GreenfootImage("TankModel.png");
        setImage(image);
        tolerance = 7;
        this.angle = direction;
        cooldown = 1;
        numBullet = 0;
        
    }
    
    
    public void act() 
    {
        // Add your action code here.
        if (cooldown > 0)
        {
            cooldown--;
        }else{
            remove = true;
        }
        
        movingTank();
        if (Greenfoot.isKeyDown("space") && numBullet<tolerance && cooldown == 0 && needToRefill == false)
        {
            shoot(angle);
            
        }
        else
        {
            if (numBullet==0)
            {
                needToRefill=false;
            }
            
            if (needToRefill)
            {
                numBullet--;
            }
                
        }     
      
     
        
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
    public void shoot(int degree)
    {
  
        shootingSound.play();
        Bullet bul = new Bullet();
        MyWorld world = (MyWorld)getWorld();
        world.addObject(bul,getX(),getY());
        bul.setRotation(degree);
        numBullet++;
        if (numBullet>=tolerance)
        {
            cooldown = MAX_COOLDOWN;
            needToRefill = true;
            remove = false;
        }
    }
    
    
    
}
