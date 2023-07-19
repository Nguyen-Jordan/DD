package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.Item;

public abstract class Enemy {
    private String name;
    private int lifePoints;
    private int  forceAttack;
    Item item;

    public Enemy (String name, int hp, int atk){
        super();
        setName(name);
        setLifePoints(hp);
        setForceAttack(atk);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getForceAttack() {
        return forceAttack;
    }

    public void setForceAttack(int forceAttack) {
        this.forceAttack = forceAttack;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "name='" + name + '\'' +
                ", lifePoints=" + lifePoints +
                ", forceAttack=" + forceAttack +
                ", item=" + item +
                '}';
    }
}
