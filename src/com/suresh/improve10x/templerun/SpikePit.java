package com.suresh.improve10x.templerun;

public class SpikePit extends Obstacle{
    private int width;
    public SpikePit(int width) throws InvalidObstacleDamageException {
        super("SpikePit", 50);
        if (width < 0 || width > 100) {
            throw new InvalidSpikePitWidthException();
        }
        this.width = width;
    }

    public void trap(Player player) {
        System.out.println( name + " trapped " + player.getName() + " inside!. it is " + width + " meters wide");
        player.reduceHealth(damage);
    }

    public class InvalidSpikePitWidthException extends RuntimeException{
    }
}
