import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Label scoreLabel;
    
    BackArrow arrow;
    Wall[] wall;
    public int button;
    
    public int score = 0;
    
    public BulletSymbol[] symbol = new BulletSymbol[8];
    private int indexImage = 0;
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1);
        
        Tank tank1 = new Tank();
        //Tank tank2 = new Tank(false);
        Coin coin = new Coin(); 
        scoreLabel = new Label(0,30);
        arrow = new BackArrow();
        wall = new Wall[10];
       
        
        setTenRandomWall();
        setBulletFigure();
        addBulletFigure();
        
        addObject(scoreLabel,30,30);
        addObject(coin,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(800));
        addObject(tank1,100,100);
        //addObject(tank2,1000,100);
        addObject(arrow,1160,30);
       // addObject(wall,Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(800));
        
    }
    
    public void act()
    {
        
    }
    
    
    public void setTenRandomWall()
    {
        //Init 10 walls
        for (int i=0; i<wall.length; i++)
        {
            wall[i] = new Wall();
            //wall[i].setRotation(Greenfoot.getRandomNumber(2)*90);
        }
        
        //Add 10 walls
        
        for (int i=0; i<wall.length; i++)
        {
            int X = Greenfoot.getRandomNumber(1000);
            int Y = Greenfoot.getRandomNumber(800);
            addObject(wall[i],X,Y);
            
        }
        
    }
    
    public void increaseScore()
    {
        score+=Greenfoot.getRandomNumber(2)+1;
        scoreLabel.setValue(score);
    }
    
    public void createCoin()
    {
        //
        Coin c = new Coin();
        int X = Greenfoot.getRandomNumber(1000);
        int Y = Greenfoot.getRandomNumber(800);
        addObject(c,X,Y);
    }
    
    public void setBulletFigure()
    {
        
        for (int i=0; i<8; i++)
        {
            symbol[indexImage] = new BulletSymbol();
            indexImage++;
        } 
       
    }
    public void addBulletFigure()
    {
        int X = 20;
        int Y = 750;
        indexImage = 0;
        
        for (int i=0; i<8; i++)
        {
            addObject(symbol[indexImage],X,Y);
            indexImage++;
            X+=14;
            
        }
    }
    
    
    
}
