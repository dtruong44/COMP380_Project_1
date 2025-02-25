import java.util.Scanner;
import java.io.FileReader;
import java.io.File;

public class UserIO {

    public static void welcomeToPerceptron(){
        printIntroMessage();
        getUserIntSelection();
    }
    static Scanner scanner = new Scanner(System.in);
    static TrainingSettings netTrainingSettings = new TrainingSettings();

    public static void printIntroMessage(){
    System.out.println("Welcome to our first neural network - A Perceptron Net!");
    System.out.println("1) Enter 1 to train the net on a data file");
    System.out.println("2) Enter 2 to test the net on a data file");
    System.out.println("3) Enter 3 to quit");
    }

    public static int getUserIntSelection(){
        int choice = scanner.nextInt();
        switch(choice){
            case 1:
                getTrainingSettings();
        }
        return 0;
    }


    public static void getTrainingSettings(){
        File file = new File("");
        String trainingFilePath;

        do{
            System.out.println("Enter the training file name: ");
            trainingFilePath = " proj1/" + scanner.nextLine() + ".txt";
            file = new File(trainingFilePath);
        } while(file.exists() == false);

        netTrainingSettings.trainingDataFile = trainingFilePath;




        
    }
}
