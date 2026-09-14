import greenfoot.*; 

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor 
{
    // instance variables - replace the example below with your own
    private int x;
    public int health = 5;
    long lastHit = System.currentTimeMillis();
    /**
     * Constructor for objects of class Enemy
     */
    public Enemy()
    {
    }

    public void act() {
        moveAround();
        dealDamage();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
 * 
 */
public void moveAround()
{
    move(1);
    MyWorld world = (MyWorld) getWorld();
    Actor player = world.player;
    if (player != null) {
        if (isAtEdge()) {
            turn(180);
        }
        if (Greenfoot.getRandomNumber(10) >= 1) {
            turnTowards(player.getX(), player.getY());
        }
    }
}

public void dealDamage() {
    MyWorld world = (MyWorld) getWorld();
    Player player = (Player) world.player;
    long currentHit = System.currentTimeMillis();
    if (currentHit >= lastHit + 1500) {//5000ms = 5s
        if (intersects(player)) {
            if (player.health != 0) {
                player.health -= 5;
            } else {
                getWorld().removeObject(player);
            }
        }
    }
}
}
