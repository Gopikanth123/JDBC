import java.sql.*;
class SelectVal
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
        s="select * from student1_4221";
        ResultSet rs=st.executeQuery(s);
        System.out.println("Roll_no      Name");
        while(rs.next())
        {
           System.out.print("  "+rs.getString("rno")+"   ");
           System.out.print("    "+rs.getString("name"));
           System.out.println();
        }
        
      }
     catch(Exception e){
        System.out.println(e);
   }
  }
}