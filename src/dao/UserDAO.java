package dao;

import connectionBD.ConnectionDB;
import model.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {
    public void createUser(User user) {
        String sql = "INSERT INTO users (name, cpf, email, phone, password, birthDate) VALUES (?, ?, ?, ?, ?)";

        try(Connection conn = ConnectionDB.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, user.getName());
            stmt.setString(2, user.getCpf());
            stmt.setString(3, user.getEmail());
            stmt.setString(4, user.getPhone());
            stmt.setString(5, user.getPassword());
            stmt.setDate(6, user.getBirthDate());

        }catch (Exception e) {
            System.out.println("Ocorred error while creating user" + e.getMessage());
        }
    }


}
