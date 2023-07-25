package fr.campus.DD.DB;

import fr.campus.DD.Character.Character;
import fr.campus.DD.Character.Warrior;
import fr.campus.DD.Equipment.DeffensiveEquipment.Shield;
import fr.campus.DD.Equipment.OffensiveEquipment.Weapon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Database {
    Connection conn = null;
    public Database() {

        try {
            conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/DonjonsAndDragons?" +
                            "user=jordan&password=Pasword.89");

        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    public void insertCharacter (Character player) {

        try {
            PreparedStatement stmt = conn.prepareStatement(
            "INSERT INTO hero (name, max_life, life, attack, type_id, DE_id, OE_id) values (?,?,?,?,?,?,?)"
            );
            stmt.setString(1, player.getName());
            stmt.setInt(2, player.getMaxLife());
            stmt.setInt(3, player.getPointLife());
            stmt.setInt(4, player.getForceAttack());
            if (player instanceof Warrior){
                stmt.setInt(5, 1);
                stmt.setInt(6, 1);
                stmt.setInt(7, 1);
            } else {
                stmt.setInt(5, 2);
                stmt.setInt(6, 2);
                stmt.setInt(7, 1);
            }

            int i = stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void editCharacter (Character player) {

        try {
            PreparedStatement stmt = conn.prepareStatement(
                    "update hero (name, max_life, life, attack, type_id, DE_id, OE_id) values (?,?,?,?,?,?,?)"
            );
            stmt.setString(1, player.getName());
            stmt.setInt(2, player.getMaxLife());
            stmt.setInt(3, player.getPointLife());
            stmt.setInt(4, player.getForceAttack());
            if (player instanceof Warrior){
                stmt.setInt(5, 1);
                stmt.setInt(6, 1);
                stmt.setInt(7, 1);
            } else {
                stmt.setInt(5, 2);
                stmt.setInt(6, 2);
                stmt.setInt(7, 1);
            }

            int i = stmt.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Connection getConn() {
        return conn;
    }
}
