package database;

import student.Student;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SQLQuery extends DbConnection{
    public static void addStudent(Student student){
        String name = student.getName();
        int roll = student.getRollNumber();
        float grade = student.getGrade();
        Connection con = DbConnection.establishConnection().orElse(null);
        if(con == null) System.out.println("Connection with database cannot be established!");
        else{
            try{
                PreparedStatement statement = con.prepareStatement(Query.ADD);
                statement.setInt(1,roll);
                statement.setString(2,name);
                statement.setFloat(3,grade);
                int updatedRows = statement.executeUpdate();
                System.out.println(updatedRows + " Rows Updated");
                con.close();
            }catch(SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static void removeStudent(int roll){
        Connection con = DbConnection.establishConnection().orElse(null);
        if(con == null) System.out.println("Connection with database cannot be established!");
        else{
            try{
                PreparedStatement statement = con.prepareStatement(Query.REMOVE);
                statement.setInt(1,roll);
                int updatedRows = statement.executeUpdate();
                System.out.println(updatedRows + " Rows Updated");
                con.close();
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
    }
    public static Optional<Student> searchStudent(int roll){
        String name = null;
        Float grade = null;
        Connection con = DbConnection.establishConnection().orElse(null);
        if(con == null){
            System.out.println("Connection with database cannot be established!");
        }
        else{
            try{
                String sql = Query.GET + roll;
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
                while(resultSet.next()){
                    name = resultSet.getString(2);
                    grade = resultSet.getFloat(3);
                }
                con.close();
                Student student = null;
                if(name != null){
                    student = new Student(name,roll,grade);
                    student.setName(name);
                    student.setRollNumber(roll);
                    student.setGrade(grade);
                }else System.out.println("Student not found!");
                return Optional.ofNullable(student);
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return Optional.empty();
    }
    public static Optional<List<Student>> displayAll(){
        Connection con = DbConnection.establishConnection().orElse(null);
        if(con == null) System.out.println("Connection with database cannot be established!");
        else{
            List<Student> studentList = new ArrayList<>();
            try{
                Statement statement = con.createStatement();
                ResultSet resultSet = statement.executeQuery(Query.GET_ALL);
                while(resultSet.next()){
                    int roll = resultSet.getInt(1);
                    String name = resultSet.getString(2);
                    float grade = resultSet.getFloat(3);
                    studentList.add(new Student(name,roll,grade));
                }
                con.close();
                return Optional.of(studentList);
            }catch (SQLException e){
                System.out.println(e.getMessage());
            }
        }
        return Optional.empty();
    }
}
