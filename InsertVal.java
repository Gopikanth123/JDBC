import java.sql.*;
class InsertVal
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
        //st.executeUpdate("create table student_4221(rno varchar(20),name varchar(20))");
        //System.out.println("Table Created");
        s="insert into student_4221 values('101','Gopi')";
        st.executeUpdate(s);
        //System.out.println("FIRST ROW INSERTED");
        //s="insert into student_4221 values('102','Manohar')";
        //st.executeUpdate(s);
        //System.out.println("SECOND ROW INSERTED");
        //s="insert into student_4221 values('103','Harsha')";
        //st.executeUpdate(s);
        //System.out.println("THIRD ROW INSERTED");
        //s="insert into student_4221 values('104','Vivek')";
        //st.executeUpdate(s);
        //System.out.println("FOURTH ROW INSERTED");
        //s="insert into student_4221 values('105','Aravindh')";
        //st.executeUpdate(s);
        //System.out.println("FIFTH ROW INSERTED");
        //s="insert into student_4221 values('106','Surendra')";
        //st.executeUpdate(s);
        //System.out.println("SIXTH ROW INSERTED");
        //s="insert into student_4221 values('106','Rajesh')";
        //st.executeUpdate(s);
        //System.out.println("SEVENTH ROW INSERTED");
     }
     catch(Exception e){
        System.out.println(e);
   }
  }
}