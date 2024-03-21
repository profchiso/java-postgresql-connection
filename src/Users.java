import java.sql.*;

public class Users {
    public static void main(String [] args) throws ClassNotFoundException {

      /*
      * import package
      * load and register
      * create connection
      * execute statement
      * process the result
      * close
      * */
        String url="jdbc:postgresql://localhost:5432/testDB?user=postgres&password=postgres";
        String query = "SELECT * FROM users where user_id = 2";
        String insert = "INSERT into users values ('ken2',true,50,5)";
        Class.forName("org.postgresql.Driver");
        try {
            Connection con = DriverManager.getConnection(url);
            Statement queryStatement = con.createStatement();

            boolean isInserted= queryStatement.execute(insert);


            //ResultSet rs =    queryStatement.executeQuery(query);
//            rs.next();
//            System.out.println(rs.getString("name"));
//            rs.next();
//            System.out.println(rs.getString("name"));
//            while (rs.next()){
//                System.out.println("Name" +" = " + rs.getString(1));
//                System.out.println("IsMarried" +" = " + rs.getBoolean(2));
//                System.out.println("Age" +" = " + rs.getInt(3));
//                System.out.println("userId" +" = " + rs.getInt(4));
//                System.out.println();
//                System.out.println("****** next user *****");
//                System.out.println();
//            }

            con.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
