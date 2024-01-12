package student;

public class Main {
    public static void main(String[] args){
        CLI.displayUI();
        int input = CLI.getInput();
        ProcessInput.processInput(input);
    }
}
