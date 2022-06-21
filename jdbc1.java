
import java.sql.*;
class jdbc1
{
public static void main(String gg[])
{ try
{
Class.forName("org.sqlite.JDBC");
Connection c;
c=DriverManager.getConnection("jdbc:sqlite:grasim.db");
Statement s;
s=c.createStatement();
s.executeUpdate("insert into Employee values(106,'Harish','M')");
s.close();
c.close();
System.out.println("Record inserted");
}catch(Exception e)
{
System.out.println(e);
}}}