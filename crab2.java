import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class crab2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class crab2 extends Actor
{
    /**
     * Act - do whatever the Crab wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(3);
        turnAtEdge();
        checkKeyPress();
        onCollision();
    }

private void turnAtEdge()
{
    if(isAtEdge())
    {
        turn(50);
    }
}

private void checkKeyPress()
{
    if(Greenfoot.isKeyDown("right"))
    {
        turn(4);
    }

if(Greenfoot.isKeyDown("left"))
{
    turn(-4);
}
}

private void onCollision()
{
    if(isTouching(Worm.class))
    {
    removeTouching(Worm.class);
    Greenfoot.playSound("slurp.wav");
}

}






}
