import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Introduction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Introduction extends World
{

    /**
     * Constructor for objects of class Introduction.
     * 
     */
    private GreenfootImage image;
    public Introduction()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        setBackground(new GreenfootImage("background.png"));
        
        Label titleTank = new Label ("Tank" , 60);
        titleTank.setFillColor(greenfoot.Color.GREEN);
        Label titleBattle = new Label ("Battle" , 60);
        titleBattle.setFillColor(greenfoot.Color.RED);
        addObject(titleTank,200,80);
        addObject(titleBattle,300,150);
        
    }
}
