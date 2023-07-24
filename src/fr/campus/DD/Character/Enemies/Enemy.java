package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Utils.Image;

public abstract class Enemy {
    private String name;
    private int lifePoints;
    private int  forceAttack;
    private Item wizardItem;
    private Item warriorItem;

    public Enemy (){
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

    public Item getWizardItem() {
        return wizardItem;
    }

    public void setWizardItem(Item item) {
        this.wizardItem = item;
    }

    public Item getWarriorItem() {
        return warriorItem;
    }

    public void setWarriorItem(Item item) {
        this.warriorItem = item;
    }
    public String toString() {
        String template = Image.get(this.getClass().getSimpleName());
        return String.format(template, this.getName(), this.getLifePoints(),this.getForceAttack());
    }
}
