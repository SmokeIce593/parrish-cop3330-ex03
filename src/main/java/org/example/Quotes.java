/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Cameron Parrish
 */

package org.example;
import java.util.Scanner;

class Quotes {
    public static void main( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.print( "What is the quote?" );
        String Quote = input.nextLine();

        System.out.print("Who said it?");
        String Quoteauthor = input.nextLine();

        System.out.print(Quoteauthor + " says, \"" + Quote + "\"");
    }
}
