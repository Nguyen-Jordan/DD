package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class Demon extends Enemy{

    public Demon (){
        super();
        setName("Demon of Izalith");
        setLifePoints(70);
        setForceAttack(15);
        randomItem();
    }

    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Gargoyle Tail Axe", 5, 5));
            setWizardItem(new Fate("Crystal Soul Spear", 8, 5));
        } else {
            setWarriorItem(new Shield("Tower Kite Shield", 4, 5));
            setWizardItem(new Potion("Medium potion", 5, 5));
        }
    }
}
