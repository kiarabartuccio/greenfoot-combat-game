import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public Sword sword;
    private int speed = 4;
    private int maxHealth = 100;
    public int health = maxHealth;
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void equipSword()
    {
        sword = new Sword();
        sword.owner = this;
        World world = getWorld();
        if (world != null)
        {
            world.addObject(sword,getX()+ 5,getY());
        }
    }
    public void act()
    {
        if (sword == null)
        {
            equipSword();
        }
        if (Greenfoot.isKeyDown("w")) {
            setLocation(getX(), getY() - speed); // Move upwards
        }
        if (Greenfoot.isKeyDown("s")) {
            setLocation(getX(), getY() + speed); // Move downwards
        }
        if (Greenfoot.isKeyDown("a")) {
            setLocation(getX() - speed, getY()); // Move left
        }
        if (Greenfoot.isKeyDown("d")) {
            setLocation(getX() + speed, getY()); // Move right
        }
    }
}

