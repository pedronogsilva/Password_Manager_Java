import java.sql.Statement; import java.sql.Connection; import java.sql.DriverManager; import java.sql.SQLException;

public class DBConnection {
    // It is public, any function can access it; It is a constant;
    public static final String DB_URL = "jdbc:sqlite:passwords.db";
    // Generate the connection
    public static Connection getConnection() {try {/*Generate DB connection; Open DB connection*/ Connection conn = DriverManager.getConnection(DB_URL); return conn;} catch (SQLException e) {return null;}}
    public static void getCreateTable() {String SQL = "CREATE TABLE IF NOT EXISTS manager (id INTEGER PRIMARY KEY AUTOINCREMENT, site TEXT NOT NULL, login TEXT NOT NULL, username TEXT NOT NULL, password TEXT NOT NULL)"; try (Connection conn = DriverManager.getConnection(DB_URL); Statement stmt = conn.createStatement()) {stmt.execute(SQL);} catch (SQLException e) {System.out.println(e.getMessage());}}
    public static void main(String[] args) {getConnection(); getCreateTable();}
}