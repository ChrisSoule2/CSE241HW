import java.sql.*;
import java.util.*;

public class Simplejdbc {
    static final String DB_URL = "jdbc:oracle:thin:@edgar1.cse.lehigh.edu:1521:cse241";

    public static void main(String[] args) {
        Connection conn = null;
        Scanner in = new Scanner(System.in);
        do {
            try {
                // getting user input for user and password
                System.out.print("Enter Oracle user id: ");
                String user = in.nextLine();
                System.out.print("Enter Oracle user password: ");
                String pass = in.nextLine();

                // initialize connection to db
                conn = DriverManager.getConnection(DB_URL, user, pass);
                System.out.println("Super! I'm connected.");

                

                //conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
                System.out.println("[Error]: Connect error. Re-enter login data.");
            }
        } while (conn == null);
    }
}