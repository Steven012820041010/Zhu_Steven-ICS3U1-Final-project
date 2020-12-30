import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackArrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackArrow extends Actor
{
    /**
     * Act - do whatever the BackArrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BackArrow()
    {
        
    }
    public void act() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) 
        {
            TitlePage introduction = new TitlePage();
            Greenfoot.setWorld(introduction);
        }
    }    
}
