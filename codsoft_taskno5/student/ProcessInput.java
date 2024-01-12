package student;

class ProcessInput {
    static void processInput(int input){
        StudentManagementSystem managementSystem = new StudentManagementSystem();
        int roll;
        Student student;
        switch (input){
            case 1 : student = CLI.addStudent();
                managementSystem.addStudent(student);
                break;
            case 2 : roll = CLI.getStudentRoll();
                managementSystem.removeStudent(roll);
                break;
            case 3 : roll = CLI.getStudentRoll();
                Student searchStudent = managementSystem.searchStudent(roll);
                System.out.println(searchStudent);
                break;
            case 4 : managementSystem.displayStudents();
                break;
            default:
                System.out.println("Invalid Input!");
        }
    }
}
