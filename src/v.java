/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author W34
 */
public class v {
public static void main(String[] args) {
 
    String incrementNumber = "";
     
    // This will make automatic increment numbers
    for(int i=0; i<=10; i++){
        if(i==0)
            incrementNumber = String.valueOf(i);
        else
            incrementNumber = incrementNumber +", "+i;
    }
    System.out.println("Automatically Increment :"+incrementNumber);
 }

 }


