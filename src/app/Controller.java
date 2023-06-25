package app;

import java.util.Random;
import java.util.Scanner;

public class Controller {

    public static void main(String[] args){
        yourInfoHeader();

        //Step 3
        int k;
        for(k = 0; k <= 14; k++){
            if(k <= 13){
                System.out.print(k+ ", ");
            }else{
                System.out.print(k+ " ");
            }
        }//end of step 3

        System.out.println("\n");

        //Step 4
        int i;
        for(i = -10; i <= 11; i = i+3){
            if(i <= 8){
                System.out.print(i+ ", ");
            }else{
                System.out.print(i+ " ");
            }
        }//end of step 4

        System.out.println("\n");

        //Step 5
        int j;
        for(j = 15; j>= 0; j--){
            if(j >= 1){
                System.out.print(j+ ", ");
            }else{
                System.out.print(j+ " ");
            }
        }//end of step 5

        System.out.println("\n");

        //Step 6
        String str = "Java Programming";
        System.out.println(str);
        int p;
        for(p = str.length()-1; p>=0; p--){
            System.out.print(str.charAt(p));
        }//end of step 6

        System.out.println("\n");
        //Step 7

        Random rndGen = new Random();
        int maxRndNumber = -100;
        int location = 1;
        for(int o = 1; o<= 25; o++){
            int currentRandomNumber = rndGen.nextInt(201) -100;
            //System.out.print(currentRandomNumber + ", ");
            if(o <= 24){
                System.out.print(currentRandomNumber + ", ");
            }else{
                System.out.print(currentRandomNumber + " ");
            }

            if(currentRandomNumber > maxRndNumber){
                maxRndNumber = currentRandomNumber;
                location = o;
            }
        }
        System.out.println();
        System.out.println("Max Random Number: " + maxRndNumber + " at location: " + location);
        //end of Step 7

        System.out.println("\n");

        //Step 8
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int keyboardInput = sc.nextInt();
        while(keyboardInput < 100){
            System.out.print("Enter a number: ");
            keyboardInput = sc.nextInt();

        }
        System.out.println("You are done");
        //end of Step 8

        System.out.println();

        //Step 9
        int input = 0;
        do{
            System.out.print("Enter a number: ");
            input = sc.nextInt();
        } while(input > 50);
        System.out.println("You are done");
        //end of Step 9

        System.out.println();

        //Step 10;
        pattern1(6, 10);
        //pattern2("TEST");
        pattern2("PROGRAMMING");
        //pattern3("TEST", 3);
        pattern3("PROGRAMMING", 6);
        //pattern4("TEST", "HELLO12");
        pattern4("CODE", "COP2210");

    }//end of main

    //Step 10
    public static void pattern1( int numberOfRows, int numberOfCols){
        for(int row = 1; row <= numberOfRows; row++){
            for(int col = 1; col <= numberOfCols; col++){
                if(row %2 == 0){
                    System.out.print("X ");
                }else{
                    System.out.print("O ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }//end of Step 10

    //Step 11
    public static void pattern2(String word){

        for(int row = 1; row <= 8; row++){
            for(int col = 1; col <= 3; col++){
                if(col==1 || col == 3){
                    System.out.print("X X X ");
                }else{
                    System.out.print(word + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    //Step 11 other way
    public static void pattern2_1(String word){
        for(int row =1; row <=8; row++){
            for( int index = 0; index < word.length() + 6; index++){
                if(index < 3){
                    System.out.print("X");
                }else if(index > word.length() -1 +3){
                    System.out.print("X");
                }
                System.out.print(word.charAt(index -3));
            }
            System.out.println();
        }
        System.out.println();
    }//end of Step 11

    //Step 12
        public static void pattern3(String word, int numberOfRows) {
            int wordLength = word.length();

            for (int row = 1; row <= numberOfRows; row++) {
                if (row % 2 == 1) {
                    for (int col = 1; col <= wordLength + 5; col++) {
                        if (col <= 5 || col > wordLength + 5) {
                            System.out.print("X ");
                        } else {
                            int charIndex = col - 6;
                            char currentChar = word.charAt(charIndex);
                            System.out.print(currentChar + " ");
                        }
                    }
                    System.out.print("X X X X X ");
                } else {
                    System.out.print("X X X X X ");
                    for (int col = 1; col <= wordLength; col++) {
                        int charIndex = wordLength - col;
                        char currentChar = word.charAt(charIndex);
                        System.out.print(currentChar + " ");
                    }
                    System.out.print("X X X X X ");
                }
                System.out.println();
            }
            System.out.println();
        }//end of Step 12

    //Step 13




        public static void pattern4(String word1, String word2) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < word1.length(); j++) {
                    System.out.print("I ");
                }
                for (int j = 0; j < word2.length(); j++) {
                    System.out.print(word2.charAt(j) + " ");
                }
                System.out.println();
            }

            for (int i = 0; i < word1.length(); i++) {
                for (int j = 0; j < word1.length(); j++) {
                    System.out.print(word1.charAt(j) + " ");
                }
                for (int j = 0; j < 7; j++) {
                    System.out.print("X ");
                }
                System.out.println();
            }

            for (int i = 0; i < word1.length(); i++) {
                System.out.print(word1.charAt(i) + " ");
            }
            for (int j = 0; j < 7; j++) {
                System.out.print("X ");
            }
            System.out.println();

            for (int i = 0; i < word1.length(); i++) {
                System.out.print(word1.charAt(i) + " ");
            }
            for (int j = 0; j < 7; j++) {
                System.out.print("X ");
            }
            System.out.println();
            System.out.println();
        }//end of Step 13





















    public static void yourInfoHeader(){
        System.out.println("================================");
        System.out.println("PROGRAMMER:  " + "Roberto Callejas");
        System.out.println("PANTHER ID:  " + "6360177");
        System.out.println();
        System.out.println("CLASS \t\t COP2210 ");
        System.out.println("SECTION: \t " + "U02C");
        System.out.println("SEMESTER: \t " + "Summer 2023");
        System.out.println("CLASS TIME: \t " + "10:00 AM - 12:50 PM");
        System.out.println();
        System.out.println("Assignment:  " + "Lab 7");
        System.out.println();
        System.out.println("CERTIFICATION: \nI understand FIU's academic policies and I certify");
        System.out.println("that this work is my own and that none of it is the");
        System.out.println("work of any other person");
        System.out.println("================================");
        System.out.println();

    }//end of yourInfoHeader
}
