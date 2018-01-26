/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zaharin
 */
import java.util.Scanner;
public class Umur {
    public static void main(String [] args) {
        
        Scanner in = new Scanner (System.in);
        System.out.println("Masukkan umur anda");
        int umur = in.nextInt();
        
        if(umur < 45){
            System.out.println("Anda masih muda dan cantik");
        }else{
            System.out.println("Anda sudah tua dan perlukan rehat");
        }
    }
    
    
}
