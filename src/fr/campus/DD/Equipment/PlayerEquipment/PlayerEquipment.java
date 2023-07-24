package fr.campus.DD.Equipment.PlayerEquipment;

import fr.campus.DD.Equipment.DeffensiveEquipment.DeffensiveEquipment;
import fr.campus.DD.Equipment.Item;
import fr.campus.DD.Equipment.OffensiveEquipment.OffensiveEquipment;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.util.ArrayList;

public class PlayerEquipment {

    public static final ArrayList<DeffensiveEquipment> defensiveList = new ArrayList<>();
    public static final ArrayList<OffensiveEquipment> offensiveList = new ArrayList<>();

    public PlayerEquipment() {

    }

    public void addDefensiveEquipment (DeffensiveEquipment item){
        defensiveList.add(item);
    }
    public void addOffensiveEquipment (OffensiveEquipment item){
        offensiveList.add(item);
    }
    public DeffensiveEquipment getDefensiveEquipment (int position){
        return defensiveList.get(position);
    }
    public OffensiveEquipment getOffensiveEquipment (int position){
        return offensiveList.get(position);
    }

    public ArrayList<DeffensiveEquipment> getDefensiveList () {
        return defensiveList;
    }
    public ArrayList<OffensiveEquipment> getOffensiveList () {
        return offensiveList;
    }

    public DeffensiveEquipment extractDefensiveItem (int position) {
        DeffensiveEquipment Equipment = getDefensiveEquipment(position);
        removeDefensiveEquipment(position);
        return Equipment;
    }

    public OffensiveEquipment extractOffensiveItem (int position) {
        OffensiveEquipment Equipment = getOffensiveEquipment(position);
        removeOffensiveEquipment(position);
        return Equipment;
    }
    public void removeDefensiveEquipment (int position){
        defensiveList.remove(position);
    }
    public void removeOffensiveEquipment (int position){
        offensiveList.remove(position);
    }


}
