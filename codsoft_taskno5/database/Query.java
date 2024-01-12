package database;

public class Query {
    protected final static String ADD = "INSERT INTO students(roll,name,grade) values (?,?,?)";
    protected final static String REMOVE = "DELETE FROM students WHERE roll = ?";
    protected final static String GET = "SELECT * FROM students WHERE roll = ";
    protected final static String GET_ALL = "SELECT * FROM students";
}
