package com.company;

/*
 * Classname : Polymorphism
 *
 * 8 June 2020
 *
 * Copyright Vasylkivska Kateryna KNTEU
 *
 * Module 2 task 3
 *
 * Create and implement  two interfaces for your class.
 * 
 */
public class Main {

    public static void main(String[] args) {

    RectangularTriangle triangle = new RectangularTriangle(3,4);
    triangle.toConsole();
        System.out.println(triangle.toXML());
    }
}
