import java.util.Random;
final class NumberGame{
    private final Random random = new Random();
    //By default, it ranges from 0 to 99 adding 1 to change its scope to 1 to 100
    private final int randomNum = random.nextInt(100) + 1;
    private boolean correctGuess;
    private int numberOfTurns;
    boolean getCorrectGuess(){
        return correctGuess;
    }
    int getNumberOfTurns(){
        return numberOfTurns;
    }
    void compare(int num){
        numberOfTurns++;
         String output = (num==randomNum) ? "Congratulations! Your Guess is correct!" :
                (Math.abs(num-randomNum)>=50) ? "Your guess is too far off!" :
                        (Math.abs(num-randomNum)>10) ? "Your guess is out of the range of 20!" :
                                (Math.abs(num-randomNum)>5) ? "Your guess is out of the range of 10!" :
                                        "Your guess is within the range of 10!";

        correctGuess = (num == randomNum);
        System.out.println(output);
    }
}