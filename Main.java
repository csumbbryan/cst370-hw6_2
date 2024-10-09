/*
 * INSTRUCTION:
 *     This is a Java staring code for hw6_2.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.

 *     Please DO NOT change the name of the main class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: Describe the main ideas of the program.
 * Name: Write your name
 * Date: MM/DD/YYYY
 */

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        //Floyd's Algorithm
        //Weighted graphs using All Pairs Shortest Paths
        //Input: the weight matrix W of a graph with no negative-length
        //cycle
        //D = W // Temp array
        //for k = 1 to n do
            //for i = 1 to n do
                //for j = 1 to n do
                    //D[i,j] = min {D[i,j], D[i,k] + D[k,j]}
        Scanner scanner = new Scanner(System.in);

        int vertCount = Integer.parseInt(scanner.nextLine());
        Integer[][] adjMatrix = new Integer[vertCount][vertCount];
        for(int i = 0; i < vertCount; i++) {
            String[] row = scanner.nextLine().split(" ");
            for(int j = 0; j < row.length; j++) {
                adjMatrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        System.out.println("Adjacency Matrix:");
        for(int i = 0; i < vertCount; i++) {
            String output = "";
            for(int j = 0; j < vertCount; j++) {
                output += adjMatrix[i][j] + " ";
            }
            System.out.println(output);
        }

    }
}

