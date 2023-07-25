package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.Random;

public class Dragon extends Enemy{

    public Dragon (){
        super();
        setName("Gaping Dragon");
        setLifePoints(120);
        setForceAttack(30);
        randomItem();
    }

    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Dragon Greatsword", 18, 6));
            setWizardItem(new Fate("Fire Surge", 16, 5));
        } else {
            setWarriorItem(new Shield("Black Iron Greatshield", 18, 5));
            setWizardItem(new Potion("High potion", 16, 5));
        }
    }
}
