package fr.campus.DD.Case;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Enemies.*;
import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Interface.Case;

public class EnemyCase implements Case {

    Enemy enemy;
    public EnemyCase (int position) {
        if (position < 12){
            this.enemy = new Goblin();
        }else if (position < 24){
            this.enemy = new Demon();
        }else if (position < 36){
            this.enemy = new Sorcerer();
        } else if (position < 48) {
            this.enemy = new Knight();
        } else if (position < 60) {
            this.enemy = new Dragon();
        }
    }
    
    public EnemyCase (Enemy boss){
        this.enemy = boss;
    }

    public void addToBackpack(Character player) {
        if (player.getClass().getSimpleName().equals("Warrior")) {
            Item enemyItem = this.enemy.getWarriorItem();
            String typeItem = enemyItem.getClass().getSimpleName();
            if (typeItem.equals("OffensiveEquipment")) {
                OffensiveEquipment offensiveItem = (OffensiveEquipment) this.enemy.getWarriorItem();
                player.getBackpack().addOffensiveEquipment(offensiveItem);
            } else {
                DeffensiveEquipment defensiveItem = (DeffensiveEquipment) this.enemy.getWarriorItem();
                player.getBackpack().addDefensiveEquipment(defensiveItem);
            }
        } else {
            Item enemyItem = this.enemy.getWizardItem();
            String typeItem = enemyItem.getClass().getSimpleName();
            if (typeItem.equals("OffensiveEquipment")) {
                OffensiveEquipment offensiveItem = (OffensiveEquipment) this.enemy.getWizardItem();
                player.getBackpack().addOffensiveEquipment(offensiveItem);
            } else {
                DeffensiveEquipment defensiveItem = (DeffensiveEquipment) this.enemy.getWizardItem();
                player.getBackpack().addDefensiveEquipment(defensiveItem);
            }
        }
    }

    public Enemy getEnemy() {
        return enemy;
    }
}
