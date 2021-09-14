import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Player controlled character to collect bananas and avoid the orangutan
 * 
 * @Frankie 
 * @1.0
 */
public class Monkey extends Actor
{
    /**
     * Act - do whatever the monkey wants to do. This method is called whenever
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
            turn(6);
        }
        if(Greenfoot.isKeyDown("left"))
        {
            turn(-6);
        }
    }
    
    private void onCollision()
    {
            if(isTouching(Banana.class))
        {
                removeTouching(Banana.class);
        GreenfootSound sound = new GreenfootSound("crunch.wav");
        sound.play();
        if(isTouching(Orangutan.class))
            sound.stop();
        if(getWorld().getObjects(Banana.class).size() == 0)
            {
                Greenfoot.setWorld(new win());
                Greenfoot.playSound("shboom.wav");
                Greenfoot.stop();
            }
        }
            if(isTouching(Orangutan.class))
        {
                Greenfoot.playSound("mogus.wav");
                Greenfoot.setWorld(new lose());
                Greenfoot.stop();
            }
    }
    }

