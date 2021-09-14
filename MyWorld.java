import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Ocean as background
 * 
 * @Frankie  
 * @1.0
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 640, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Orangutan orangutan = new Orangutan();
        addObject(orangutan,75,175);
        Monkey monkey = new Monkey();
        addObject(monkey,193,169);
        for(int i = 0; i < 16; i++)
        {
            Banana banana = new Banana();
            int imageWidth = banana.getImage().getWidth();
            int imageHeight = banana.getImage().getHeight();
            int xpos = imageWidth + Greenfoot.getRandomNumber(getWidth() - 2 * imageWidth);
            int ypos = imageHeight + Greenfoot.getRandomNumber(getHeight() - 2 * imageHeight);
            addObject(banana,xpos,ypos);    
        }

        orangutan.setLocation(36,180);
        orangutan.setLocation(540,180);
        Orangutan orangutan2 = new Orangutan();
        addObject(orangutan2,328,551);
    }
}
