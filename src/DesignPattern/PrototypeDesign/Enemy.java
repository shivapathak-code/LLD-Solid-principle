package DesignPattern.PrototypeDesign;

// yahan ham clone se copy kerte hain
// prototype main pahle se template rehto hain bas copy kerke edit kero ye kaam rehta hain
public class Enemy implements Cloneable {

    private String type;
    private int health;
    private int damage;

    public Enemy(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    // Prototype: existing object ki copy
    @Override
    public Enemy clone() {
        try {
            return (Enemy) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError(e);
        }
    }

    public void showDetails() {
        System.out.println(
                type + " | Health: " + health
                        + " | Damage: " + damage
        );
    }

    public void setHealth(int health) {
        this.health = health;
    }
    public void setType(String type) {
        this.type = type;
    }
}

class test1 {
    public static void main(String[] args) {

        // Original prototype object
        Enemy original = new Enemy("Zombie", 200, 20);

        // Existing object ki copy
        Enemy enemy1 = original.clone();
        Enemy enemy2 = original.clone();
        Enemy enemy3 = original.clone();

        enemy1.setHealth(50);
        enemy1.setType("Boot");// yahan se ham jisko edit kerna hota hain yahan se ker deta hain
        enemy3.setHealth(100);
        enemy3.setType("Rakshaya");

        original.showDetails();
        enemy1.showDetails();
        enemy2.showDetails();
        enemy3.showDetails();
    }
}
