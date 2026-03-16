/*
* File: Getlist.java
* Author: Magyar Márk
* Copyright: 2026, Magyar Márk
* Group: Szoft I/N
* Date: 2026-03-16
* Github:https://github.com/DexTher22/dolgbeker
* Licenc: MIT
*/
package com.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Getlist {
    protected static ArrayList<Double> getValues() {

    ArrayList<Double> values = new ArrayList<Double>();
    Scanner sc = new Scanner(System.in);
    double value;
    do{
        System.out.print("Adja meg a mennyiséget (0 végjelig): ");
        value =sc.nextDouble();
        if(value != 0){
            values.add(value);
        }
    }while(value != 0);
    sc.close();
    return values;
    }
}
