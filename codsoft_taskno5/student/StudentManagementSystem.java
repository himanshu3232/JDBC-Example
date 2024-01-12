package student;

import database.SQLQuery;

import java.util.List;
import java.util.Optional;

class StudentManagementSystem{
  void addStudent(Student student) {
    SQLQuery.addStudent(student);
  }
  void removeStudent(int roll) {
    SQLQuery.removeStudent(roll);
  }
  Student searchStudent(int rollNumber) {
    return SQLQuery.searchStudent(rollNumber).orElse(null);
  }
  void displayStudents(){
      SQLQuery.displayAll().ifPresent(studentList -> studentList.forEach(System.out::println));
  }
}
