import java.sql.*;
class UpdateVal
{
  public static void main(String args[])
  {
     String s;
     try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
        System.out.println("Connection Established");
        Statement st=con.createStatement();
        s="update student_4221 set rno='107' where name='Rajesh'";
        st.executeUpdate(s);
        System.out.println("Record Updated");
      }
     catch(Exception e){
        System.out.println(e);
   }
  }
}