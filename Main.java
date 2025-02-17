/*
 * INSTRUCTION:
 *     This is a Java staring code for hw6_2.
 *     When you finish the development, download this file and and submit to Canvas
 *     according to the submission instructions.

 *     Please DO NOT change the name of the main class "Main"
 */

// Finish the head comment with Abstract, Name, and Date.
/*
 * Abstract: Program accepts vertices and weighted adjacency matrix, then determines the
 * All-Pairs Shortest Path, output as a Matrix
 * Name: Bryan Zanoli
 * Date: 10/15/2024
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
        Integer[][] spMatrix = new Integer[vertCount][vertCount];
        for(int i = 0; i < vertCount; i++) {
            String[] row = scanner.nextLine().split(" ");
            for(int j = 0; j < row.length; j++) {
                adjMatrix[i][j] = Integer.parseInt(row[j]);
            }
        }

        /*
        System.out.println("Adjacency Matrix:");
        for(int i = 0; i < vertCount; i++) {
            String output = "";
            for(int j = 0; j < vertCount; j++) {
                output += adjMatrix[i][j] + " ";
            }
            System.out.println(output);
        }
        */

        for(int k = 0; k < vertCount; k++) {
            for(int i = 0; i < vertCount; i++) {
                for (int j = 0; j < vertCount; j++) {
                    //System.out.println("Processing: \n ij: " + adjMatrix[i][j] +
                    //    " ik: " + adjMatrix[i][k] + " kj: " + adjMatrix[k][j]);
                    if(adjMatrix[i][k] != -1 && adjMatrix[k][j] != -1) {
                        if(adjMatrix[i][j] == -1) {
                            adjMatrix[i][j] = adjMatrix[i][k] + adjMatrix[k][j];
                        } else {
                            adjMatrix[i][j] = Math.min(adjMatrix[i][j],
                                adjMatrix[i][k] + adjMatrix[k][j]);
                        }
                    }

                }
            }
        }

        //System.out.println("Shortest Path Matrix:");
        for(int i = 0; i < vertCount; i++) {
            String output = "";
            for(int j = 0; j < vertCount; j++) {
                output += adjMatrix[i][j];
                if(j != vertCount - 1) output += " ";
            }
            System.out.println(output);
        }

    }
}

