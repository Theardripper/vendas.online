package dao;

import connectionBD.ConnectionDB;
import model.entity.User;

import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    public void createUser(User user) {
        String sql = "INSERT INTO users (name, cpf, email, phone, password, birthDate) VALUES (?, ?, ?, ?, ?, ?)";

        try(Connection conn = ConnectionDB.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getPassword());
            stmt.setDate(6, user.getBirthDate());
            stmt.executeUpdate();

        }catch (Exception e) {
            System.out.println("Occurred error while creating user" + e.getMessage());
        }
    }

    public List<User> listUsers() {
        List<User> users = new ArrayList<>();
        String sql = "SELECT * FROM users";

        try (Connection conn = ConnectionDB.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()){
                User user = new User(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getString("cpf"),
                rs.getString("email"),
                rs.getString("phone"),
                rs.getString("password"),
                rs.getDate("birthDate")
                );
                users.add(user);
            }
        } catch (Exception e) {
            System.out.println("Occurred error while listing users" + e.getMessage());
        }
        return users;
    }

    public User updateUser(User user) {
        String sql = "UPDATE users SET name = ?, cpf = ?, email = ?, phone = ?, password = ?, birthDate = ? WHERE id = ?";
        try (Connection conn = ConnectionDB.connect();
        PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(3, user.getPhone());
            stmt.setString(4, user.getPassword());
            stmt.setDate(5, user.getBirthDate());
            stmt.setInt(6, user.getId());
            stmt.executeUpdate();

            System.out.println("User updated successfully");
        } catch (Exception e) {
            System.out.println("Occurred error while updating user" + e.getMessage());
        }
        return user;
    }

    public void deleteUser(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = ConnectionDB.connect();
        PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("User deleted successfully");
        } catch (Exception e) {
            System.out.println("Occurred error while deleting user" + e.getMessage());
        }
    }

}
