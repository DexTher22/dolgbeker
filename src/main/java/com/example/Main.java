/*
* File: Main.java
* Author: Magyar Márk
* Copyright: 2026, Magyar Márk
* Group: Szoft I/N
* Date: 2026-03-16
* Github:https://github.com/DexTher22/dolgbeker
* Licenc: MIT
*/

package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
 
        ArrayList<Double> value = Getlist.getValues();
        Solution.task01(value);
    }
}
