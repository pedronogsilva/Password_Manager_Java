import java.sql.Connection; import java.sql.PreparedStatement; import java.sql.SQLException; import java.util.Scanner;

public class PasswordManager {
    public static Scanner Scanner = new Scanner(System.in);

    public static void getAdd() {
        Main.ClearScreen();
        System.out.printf("---------------Adding Password---------------\n\n\tWhat is the app or website?\n   ->");
        String site = Scanner.nextLine();
        if (site.trim().isEmpty() || site == null) {Main.ClearScreen(); System.out.printf("---------------Adding Password---------------\n\n      Site/App empty! Press ENTER."); Scanner.nextLine(); return;}
        site = site.trim(); site = site.substring(0, 1).toUpperCase() + site.substring(1).toLowerCase();
        Main.ClearScreen();
        System.out.printf("---------------Adding Password---------------\n\n\t[1] Username/Email,  Password\n\t[2] Fast Login\n   ->");
        String login = Scanner.nextLine();
        switch (login) {
            case "1":
                Main.ClearScreen();
                System.out.printf("---------------Adding Password---------------\n\n\tUsername/Email:\n   ->");
                String username = Scanner.nextLine();
                if (username.trim().isEmpty() || username == null) {Main.ClearScreen(); System.out.printf("---------------Adding Password---------------\n\n\tUser/Email empty! Press ENTER."); Scanner.nextLine(); return;}
                System.out.printf("\n      Password:\n   ->");
                String password = Scanner.nextLine();
                if (username.trim().isEmpty() || username == null) {Main.ClearScreen(); System.out.printf("---------------Adding Password---------------\n\n\tPassword empty! Press ENTER."); Scanner.nextLine(); return;}
                String INSERT = "INSERT INTO manager (site, login, username, password) VALUES (?, ?, ?, ?)";
                try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(INSERT)) {ps.setString(1, site); ps.setString(2, login); ps.setString(3, username); ps.setString(4, password); ps.executeUpdate();} catch (SQLException e) {e.printStackTrace();}
                break;
            case "2":
                Main.ClearScreen();

                break;
            default:
                Main.ClearScreen(); System.out.printf("---------------Adding Password---------------\n\n\tInvalid Option! Press ENTER."); Scanner.nextLine();
                break;
        }
    }
    public static void getView() {
        DBConnection.getConnection(); Main.ClearScreen();
    }
    public static void getEdit() {
        DBConnection.getConnection(); Main.ClearScreen();
    }
    public static void getDelete() {
        DBConnection.getConnection(); Main.ClearScreen();
    }

    public static void main(String[] args) {
    }
}
