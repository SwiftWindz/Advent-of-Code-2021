package day_2.src;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import day_2.src.Submarine;

public class SubMainPartOne {

    public static void main(String[] args) {

        //Instance of submarine
        Submarine YellowSubmarine = new Submarine();

        try {
            //Open the file
            File subMovements = new File("day_2\\data\\data.txt");
            //Create file reader
            Scanner myReader = new Scanner(subMovements);

            //Loop through file
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              String [] dataArray = data.strip().split(" ");
              String command = dataArray[0];
              int movement = Integer.parseInt(dataArray[1]);  
     
              if (command.equals("up")) {YellowSubmarine.decreaseDepth(movement);}
              else if (command.equals("down")){YellowSubmarine.increaseDepth(movement);}
              else if (command.equals("forward")){YellowSubmarine.increaseHorPos(movement);}

            }

            //Closes the file reader
            myReader.close();
            //Calculates the final distance
            int totalDistance = YellowSubmarine.getHorPos() * YellowSubmarine.getDepth();

            System.out.println("[Part 1] The submarine has traveled {" + Integer.toString(totalDistance) + "} meters.");

        //File cannot be found
        } catch (FileNotFoundException e) {

          System.out.println("An error occurred.");
          e.printStackTrace();

        }
    }
}

