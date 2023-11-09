import java.sql.*;
public class delete {
    private static final String URL = "jdbc:mysql://localhost:3306/customers";
    private static final String USER = "root";
    private static final String PASSWORD = "zaq1@WSX";
    private String deleteRow;
    public delete(String deleteRow){
        this.deleteRow = deleteRow;
    }

    public void setDeleteRow(){
        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
            String sql = "DELETE FROM KLIENT WHERE " + deleteRow;
            pstm = conn.prepareStatement(sql);
            int affectedRow = pstm.executeUpdate();
            System.out.println(affectedRow + " rows deleted.");
        } catch (SQLException se){
            se.printStackTrace();
        } finally {
            try {
                if (pstm != null) pstm.close();
                if (conn != null) conn.close();
            } catch (SQLException se2){
                se2.printStackTrace();
            }
        }
    }
}
