import java.util.Scanner;

public class Main {

    static void ClearScreen() {/*Clear the console*/ System.out.print("\033[H\033[2J"); System.out.flush();}

    public static void main(String[] args) throws Exception {
        Scanner Scanner = new Scanner(System.in);
        DBConnection.getConnection();
        while (true) {
            ClearScreen();
            System.out.printf("---------------Password Manager App---------------\n\n\t[1] Add Password\n\t[2] View Passwords\n\t[3] Edit Password\n\t[4] Delete Password\n\t[5] Exit App\n   ->");
            int Option = Scanner.nextInt();
            switch (Option) {case 1: PasswordManager.getAdd(); break; case 2: System.out.printf("2"); break; case 3: System.out.printf("3"); break; case 4: System.out.printf("4"); break; case 5: System.out.printf("5"); return; default: System.out.printf("Invalid Option! Please try again.\n"); break;}
        }
    }
}
