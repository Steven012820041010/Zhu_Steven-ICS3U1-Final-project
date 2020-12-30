import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitlePage extends World
{

    /**
     * Constructor for objects of class Introduction.
     * 
     */
    GreenfootImage tankImage = new GreenfootImage("tankBattle.png");
    Label titleTank;
    Label titleBattle;
    Label[] startButton;
    Label[] gameInfo;
    
    public TitlePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        setBackground(new GreenfootImage("tank background.png"));
        
        getBackground().drawImage(tankImage,350,60);
        
        
        //Init
        titleTank = new Label ("TANK" , 110);
        titleBattle = new Label ("BATTLE" , 110);
        startButton = new Label[2];
        gameInfo = new Label[2];
        
        //Animation of the word
        setAnimationOfInstruction(startButton,30,"Press 's' to start the game ");
        setAnimationOfInstruction(gameInfo,20,"Press 'i' to check the instructions of the game ");
        
        //Tank
        titleTank.setFillColor(greenfoot.Color.GREEN);
        titleTank.setLineColor(greenfoot.Color.GREEN.darker().darker());
        //Battle
        titleBattle.setFillColor(greenfoot.Color.RED);
        titleBattle.setLineColor(greenfoot.Color.RED.darker().darker());
        
        
        
        addObject(titleTank,400,240);
        addObject(titleBattle,550,350);
        addObject(startButton[0],500,500);
        addObject(gameInfo[0],500,550);
        
       
    }
    
    public void setAnimationOfInstruction(Label[] label,int fontSize,String instruction)
    {
        for (int i=0; i<label.length; i++)
        {
            label[i] = new Label (instruction, fontSize + 2*i);
            label[i].setFillColor(greenfoot.Color.BLACK);
        }
    }
    
    
    public void act()
    {
        animateInstruction();
        playGameOrReadIntro();
        
    }
    
    public void playGameOrReadIntro()
    {
         if (Greenfoot.isKeyDown("s"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
        
        if (Greenfoot.isKeyDown("i"))
        {
            Introduction intro = new Introduction();
            Greenfoot.setWorld(intro);
        }
    }
     
    public void animateInstruction()
    {
        for (int i=0; i<gameInfo.length; i++)
        {
            addObject(startButton[i],500,500);
            addObject(gameInfo[i],500,550);
            
            Greenfoot.delay(8);
            
            removeObject(startButton[i]);
            removeObject(gameInfo[i]);
        }
    }
}
