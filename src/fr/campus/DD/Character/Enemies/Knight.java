package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class Knight extends Enemy{

    public Knight (){
        super();
        setName("Balder Knight");
        setLifePoints(120);
        setForceAttack(25);
        randomItem();
    }
    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Obsidian Greatsword", 15, 4));
            setWizardItem(new Fate("Black Flame", 12, 4));
        } else {
            setWarriorItem(new Shield("Bloodshield", 15, 7));
            setWizardItem(new Potion("Big potion", 12, 5));
        }
    }
}
