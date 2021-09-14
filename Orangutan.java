import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Goes around the map, and if it hits the player it 
 * 
 * @Frankie
 * @1.0
 */
public class Orangutan extends Actor
{
    /**
     * Act - do whatever the orangutan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(5);
        turnAtEdge();
    }
    
    private void turnAtEdge()
    {
        if(isAtEdge())
        {
            turn(Greenfoot.getRandomNumber(360));
        }
    }
}
