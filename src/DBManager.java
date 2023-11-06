import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
    // Dane dostępowe do bazy danych (przykładowe)
    private static final String URL = "jdbc:mysql://localhost:3306/customers";
    private static final String USER = "root";
    private static final String PASSWORD = "zaq1@WSX";

    public void main() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            stmt = conn.createStatement();
            String sql = "SELECT * FROM Klient";
            rs = stmt.executeQuery(sql);

            while(rs.next()){
                // Pobierz dane przez nazwę kolumny
                int id  = rs.getInt("klientID");
                String imie = rs.getString("imie");
                String nazwisko = rs.getString("nazwisko");
                int aktywny = rs.getInt("aktywny");

                // Wyświetl wartości
                System.out.print("ID: " + id);
                System.out.print(", Imię: " + imie);
                System.out.print(", Nazwisko: " + nazwisko);
                System.out.println(", Aktywny: " + aktywny);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            // W końcu zamykamy zasoby
            try{
                if(rs != null) rs.close();
                if(stmt != null) stmt.close();
                if(conn != null) conn.close();
            }catch(SQLException se2){
                // Nic nie rób
            }
        }
    }

}
