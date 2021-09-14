import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Banana to be eaten by the player (monkey).
 * 
 * @Frankie Nay
 * @1.0
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
         move(5);
         turn(Greenfoot.getRandomNumber(5));
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
