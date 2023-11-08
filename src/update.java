import java.sql.*;

public class update {
    // Dane dostępowe do bazy danych (przykładowe)
    private static final String URL = "jdbc:mysql://localhost:3306/customers";
    private static final String USER = "root";
    private static final String PASSWORD = "zaq1@WSX";
    private String condition;
    private String setValue;
    public update(String condition, String setValue){
        this.condition = condition;
        this.setValue = setValue;
    }

    public void updateDatabase() {
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String sql = "UPDATE Klient SET " + setValue + " WHERE " + condition;
            pstmt = conn.prepareStatement(sql);
            // Execute update
            int affectedRows = pstmt.executeUpdate();
            System.out.println(affectedRows + " rows updated.");
        } catch (SQLException se) {
            se.printStackTrace();
        } finally {
            // Close resources
            try {
                if(pstmt != null) pstmt.close();
                if(conn != null) conn.close();
            } catch(SQLException se2) {
                se2.printStackTrace();
            }
        }
    }

}
