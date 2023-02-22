import java.sql.*;
class DeleteVal
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
        s="delete from student_4221 where rno='101'";
        st.executeUpdate(s);
        System.out.println("Record deleted successfully");
        s="delete from student_4221 where rno='108'";
        st.executeUpdate(s);
        System.out.println("Record deleted successfully");
      }
     catch(Exception e){
        System.out.println(e);
   }
  }
}