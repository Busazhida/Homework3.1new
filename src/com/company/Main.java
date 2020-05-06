package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
       double[] fractions = {0.3, -4.5, 9.4, 5.1, -7.9, 5.5, 6.2, 8.4, -3.1, 9.9, -1.2, 2.1, -3.3, 7.6, 1.1 };
       double sum = 0;
       double col = 0;
       boolean isOtr = false;
        for (double num: fractions) {
            if(num < 0){
                isOtr = true;
            } else{
                if(isOtr){
                 col++;
                 sum += num;
                }
            }
        }
        System.out.println(sum/col);
    }
}
