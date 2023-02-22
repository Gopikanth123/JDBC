import java.sql.*;
class Connect
{
  public static void main(String args[])
  {
     try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
        System.out.println("Connection Established");
        Statement st=con.createStatement();
        st.executeUpdate("create table student11_4221(rno varchar(20),name varchar(20))");
        System.out.println("Table Created");
     }
     catch(Exception e){
        System.out.println(e);
   }
  }
}