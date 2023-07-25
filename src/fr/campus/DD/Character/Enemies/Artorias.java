package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class Artorias extends Enemy{

    public Artorias (){
        super();
        setName("Artorias");
        setLifePoints(220);
        setForceAttack(35);
        randomItem();
    }
    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Greatsword of Artorias", 25, 8));
            setWizardItem(new Fate("Great Combustion", 20, 8));
        } else {
            setWarriorItem(new Shield("Greatshield of Artorias", 25, 8));
            setWizardItem(new Potion("Cure", 20, 8));
        }
    }
}
