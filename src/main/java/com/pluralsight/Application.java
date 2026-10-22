package com.pluralsight;

public class Application {
    public static void main(String[] args) {

        int[] testScores = {80, 99, 45, 56, 100, 81, 77, 52, 92, 38};

        int sum = 0;
        int highScore = testScores[0];
        int lowScore = 0;

        for(int testScore : testScores){
            sum += testScore;
        }

        for (int testScore : testScores) {
            lowScore = testScore;
        }

        for (int testScore : testScores){
            if(testScore > highScore){
                highScore = testScore;
            }
        }

        int averageScore = sum / testScores.length;

        System.out.println("Average Score: " + averageScore);
        System.out.println("Lowest Score: " + lowScore);
        System.out.println("Highest Score: " + highScore);
    }

}
