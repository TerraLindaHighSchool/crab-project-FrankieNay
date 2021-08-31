import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The lobster is the enemy of the Crab
 * 
 * @Frankie Nay 
 * @8/31/2021
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
    }

    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(50);
        }
    }
}
