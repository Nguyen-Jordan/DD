package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class Sorcerer extends Enemy{

    public Sorcerer (){
        super();
        setName("Oolacile Sorceress");
        setLifePoints(90);
        setForceAttack(25);
        randomItem();
    }

    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Claymore", 12, 4));
            setWizardItem(new Fate("Heavy Soul Arrow", 10, 4));
        } else {
            setWarriorItem(new Shield("Crest Shield", 12, 6));
            setWizardItem(new Potion("Big potion", 10, 5));
        }
    }
}
