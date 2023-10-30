package com.github.m0ttii;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Move move = new Move("E2-E4");
        System.out.println(move.getFrom().getColumn());
        System.out.println(move.getTo().getRow());
    }
}