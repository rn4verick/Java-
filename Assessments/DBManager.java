package Assessment2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DBManager {


    private static final String URL = "jdbc:mysql://localhost:3306/hangman";
    private static final String USER = "root";
    private static final String PASS = "";


    private static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }


    public static boolean registerUser(String username, String password) {
        String sql = "INSERT INTO users (username, password) VALUES (?, ?)";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            stmt.executeUpdate();
            return true; // Registration successful
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Username already taken.");
            return false; // Username exists
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


    public static User checkLogin(String username, String password) {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                int id = rs.getInt("id");
                int score = rs.getInt("score");
                return new User(id, username, score);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void updateScore(User user) {
        String sql = "UPDATE users SET score = ? WHERE id = ?";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, user.getScore());
            stmt.setInt(2, user.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static List<User> getTopPlayers() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM users ORDER BY score DESC LIMIT 10";
        try (Connection conn = connect(); PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("username");
                int score = rs.getInt("score");
                list.add(new User(id, name, score));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
