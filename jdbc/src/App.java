import java.sql.*;

public class App {

    static final String URL = "jdbc:mysql://localhost:3306/Hello";
    static final String USER = "root";
    static final String PASS = "Varun@1212";

    public static void main(String[] args) throws Exception {
    
        Connection conn = DriverManager.getConnection(URL, USER, PASS);
        Statement stmt = conn.createStatement();

        // String sqr = "Create table student( st_id int primary key, st_name varchar(50), st_course varchar(20))";
        // String sq2 = "Insert into student values(101,'Varun','BCA')";

        ResultSet rs = stmt.executeQuery("select * from student");

        int st_id;
        String st_name;
        String st_course;


        System.out.println("ST_ID      ST_NAME     ST_COURSE");
        
        while(rs.next()){

            st_id = rs.getInt("st_id");
            st_name = rs.getString("st_name");
            st_course = rs.getString("st_course");

        System.out.println(st_id+"      "+st_name+"     "+st_course);
        }   

        conn.close();
        
    }
}
