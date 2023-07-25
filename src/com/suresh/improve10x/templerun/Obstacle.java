package com.suresh.improve10x.templerun;

public class Obstacle {
    protected String name;
    protected int damage;

    public Obstacle(String name, int damage) throws InvalidObstacleDamageException {
        this.name = name == null ? "" : name.trim();
        if (damage < 0 || damage > 100) {
            throw new InvalidObstacleDamageException();
        }
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void collide(Player player) {
        System.out.println(name + "has collide " + name + " and caused" + damage);
        player.reduceHealth(damage);
    }

    public class InvalidObstacleDamageException extends Exception {
    }
}
