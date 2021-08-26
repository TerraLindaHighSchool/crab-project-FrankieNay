import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super(560, 560, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab crab = new Crab();
        addObject(crab,225,177);
        Worm worm = new Worm();
        addObject(worm,351,260);
        Worm worm2 = new Worm();
        addObject(worm2,369,431);
        Worm worm3 = new Worm();
        addObject(worm3,403,42);
        Worm worm4 = new Worm();
        addObject(worm4,167,416);
        Worm worm5 = new Worm();
        addObject(worm5,474,299);
        Worm worm6 = new Worm();
        addObject(worm6,172,65);
        Worm worm7 = new Worm();
        addObject(worm7,145,298);
        Worm worm8 = new Worm();
        addObject(worm8,431,149);
    }
}