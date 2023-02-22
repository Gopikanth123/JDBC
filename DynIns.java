import java.sql.*;
import java.util.*;
class DynIns
{
  public static void main(String args[])
  {
      String s;
      try{
      Class.forName("oracle.jdbc.driver.OracleDriver");
      System.out.println("Driver Loaded");
      Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
      System.out.println("Connection Established");
      //Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
      //st.executeUpdate("create table student2_4221(rno varchar(20) primary key,name varchar(20), percentage varchar(5))");
      //System.out.println("Table Created");
      String rno,name,percentage;
      int n;
      Scanner read=new Scanner(System.in);
      System.out.println("Enter the number of records do you want to insert?:-");
      n=read.nextInt();
      for (int i=0;i<n;i++){
         System.out.println("Enter the roll no:-");
         rno=read.next();
         System.out.println("Enter the name:-");
         name=read.next();
         System.out.println("Enter the percentage:-");
         percentage=read.next();  
         String sql="insert into student1_4221 values(?,?,?)";
         PreparedStatement st=con.prepareStatement(sql);  
         st.setString(1,rno);
         st.setString(2,name);
         st.setString(3,percentage);
         int a=st.executeUpdate();
         System.out.println(i+" records inserted");    
      }
        String sql1="select * from from student1_4221";
        PreparedStatement p1=con.prepareStatement(sql1);
        ResultSet rs=p1.executeQuery();
        System.out.println("rno     Name      Percentage");
        while(rs.next())
        {
           System.out.print(" "+rs.getString("rno")+" ");
           System.out.print(" "+rs.getString("name")+" ");
           System.out.print(" "+rs.getString("percentage")+" ");
           System.out.println();
        }
         System.out.println("after deleting");
         System.out.println();
         System.out.println();
      
     }
     catch(Exception e){
        System.out.println(e);
   }
  }
}