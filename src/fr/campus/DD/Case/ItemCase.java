package fr.campus.DD.Case;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Enemies.*;
import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.DeffensiveEquipment.Potion;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Equipment.OffensiveEquipment.Fate;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;
import fr.campus.DD.Interface.Case;

import java.util.Random;

public class ItemCase implements Case {

    Item warriorItem;
    Item wizardItem;
    public ItemCase (int position) {
        if (position < 15){
            randomItem();
        }else if (position < 35){
            this.warriorItem = new Demon().getWarriorItem();
            this.wizardItem = new Demon().getWizardItem();
        }else if (position < 45){
            this.warriorItem = new Sorcerer().getWarriorItem();
            this.wizardItem = new Sorcerer().getWizardItem();
        } else if (position < 55) {
            this.warriorItem = new Knight().getWarriorItem();
            this.wizardItem = new Knight().getWizardItem();
        } else if (position < 60) {
            this.warriorItem = new Dragon().getWarriorItem();
            this.wizardItem = new Dragon().getWizardItem();
        }
    }
    public void randomItem () {
        Random rand = new Random();
        int randInt = rand.nextInt(2);

        if (randInt == 0){
            this.warriorItem = new Weapon("Katana", 6, 7);
            this.wizardItem = new Fate("Lightning", 6, 7);
        } else {
            this.warriorItem = new Shield("Caduceus Round Shield", 6, 7);
            this.wizardItem = new Potion("Small potion", 3, 5);
        }
    }
    public Item getWarriorItem() {
        return warriorItem;
    }

    public Item getWizardItem() {
        return wizardItem;
    }

}
