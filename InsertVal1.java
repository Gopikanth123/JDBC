import java.sql.*;
class InsertVal1
{
  public static void main(String args[])
  {
     String s;
     try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver Loaded");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
        System.out.println("Connection Established");
        Statement st=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
        //st.executeUpdate("create table student1_4221(rno varchar(20) primary key,name varchar(20), percentage varchar(5))");
        //System.out.println("Table Created");
        //s="insert into student1_4221 values('101','Gopi','9.04')";
        //st.executeUpdate(s);
        //s="insert into student1_4221 values('102','Rikesh','9.5')";
        //st.executeUpdate(s);
        //s="insert into student1_4221 values('103','Jagadeesh','9.2')";
        //st.executeUpdate(s);
        //s="insert into student1_4221 values('104','Nikhil','9.3')";
        //st.executeUpdate(s);
        //System.out.println("Values Inserted");
        s="select * from student1_4221";
        ResultSet rs=st.executeQuery(s);
        
       
        while(rs.next()){
        System.out.print("   "+rs.getString("rno")+"   ");
        System.out.print("    "+rs.getString("name")+"   ");
        System.out.print("    "+rs.getString("percentage")+"   ");        
        System.out.println();
        }
        rs.absolute(2);  
        while(rs.next()){
        System.out.print("   "+rs.getString("rno")+"   ");
        System.out.print("    "+rs.getString("name")+"   ");
        System.out.print("    "+rs.getString("percentage")+"   ");        
        System.out.println();
        }
        rs.beforeFirst();
        while(rs.next()){
        System.out.print("   "+rs.getString("rno")+"   ");
        System.out.print("    "+rs.getString("name")+"   ");
        System.out.print("    "+rs.getString("percentage")+"   ");        
        System.out.println();
        }
//System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));  
//System.out.println(s);
     }
     catch(Exception e){
        System.out.println(e);
   }
  }
}