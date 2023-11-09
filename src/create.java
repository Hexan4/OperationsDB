import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class create {
    private static final String URL = "jdbc:mysql://localhost:3306/customers";
    private static final String USER = "root";
    private static final String PASSWORD = "zaq1@WSX";
    private String name;
    private String surname;
    private int active;
    public create(String name, String surname, int active){
        this.name = name;
        this.surname = surname;
        this.active = active;
    }
    public void insterInto(){
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "INSERT INTO Klient (imie, nazwisko, aktywny) VALUES ('" +name + "', '" + surname + "'," + active + ")";
            pstm = conn.prepareStatement(sql);

            int affectedRows = pstm.executeUpdate();
            System.out.println(affectedRows + " row inserted");
        }catch (SQLException se){
            se.printStackTrace();
        }finally {
            try {
                if (pstm != null)pstm.close();
                if (conn != null) conn.close();
            }catch (SQLException se2){
                se2.printStackTrace();
            }
        }
    }
}
