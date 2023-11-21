/**
 * i hate 2d arrays
 */

package lectures;

public class ArrayDemo {
    public static void main(String[] args) {
        
        //creating a ragged array
        double[][] scores = new double[3][]; //3 rows, columns not defined
        scores[0] = new double[3]; //creates a 1d array with 3 columns
        scores[1] = new double[2];
        scores[2] = new double[4];

        //populating the ragged array
        scores[0][0] = 20;  scores[0][1] = 70;  scores[0][2] = 90;
        scores[1][0] = 100; scores[1][1] = 80;
        scores[2][0] = 20; scores[2][1] = 50; scores[2][2] = 20; scores[2][3] = 50;
        
        //printing ragged array
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }
        
        //finding highest score in third column of scores
        double initial = scores[0][2];

        for (int i = 0; i < scores.length; i++) {
            if (scores[i].length >= 3) { //outer if statement checks if row has sufficient amount of columns
                if (scores[i][2] > initial)
                    initial = scores[i][2];
            }
        }
        //finding total
        double total = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                total += scores[i][j];
            }
        }
        System.out.println("max value in third column: " + initial);
        System.out.println("total value: " + total);


    }

}


