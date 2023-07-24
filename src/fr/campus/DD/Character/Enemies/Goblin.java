package fr.campus.DD.Character.Enemies;

import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;
import java.util.Random;

public class Goblin extends Enemy{

    public Goblin (){
        super();
        setName("Dark Goblin");
        setLifePoints(50);
        setForceAttack(10);
        randomItem();
    }
    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            setWarriorItem(new Weapon("Curved Swords", 3, 7));
            setWizardItem(new Fate("Fireball", 6, 5));
        } else {
            setWarriorItem(new Shield("East-West Shield", 3, 7));
            setWizardItem(new Potion("Small potion", 3, 5));
        }
    }
}
