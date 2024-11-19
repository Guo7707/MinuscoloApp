/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._4infd_lombardo_maiuscoloapp;

import java.util.Scanner;

/**
 *
 * @author Lombardo Guido.
 */
public class Minuscolo 
{
    //Attributi:
    static int TANTI = 30;
    String parola;
    //Metodi:
    public void Scan(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInserisci una parola : ");
        parola = scanner.next(); 
    }
    
    public void charMin(){
        char[] minuscolo = new char[TANTI]; 
        for (int x= 0 ; x< parola.length(); x++){
            minuscolo[x] = parola.charAt(x); // primo carattere letto 
            
        }
        for( int x = 0 ; x < parola.length(); x++){
            minuscolo[x]= Character.toLowerCase(minuscolo[x]); //in minuscolo 
            
        }
        System.out.print("\nla parola in minuscolo (array) : ");
        for(int x =0 ; x < minuscolo.length ; x++){
            System.out.print(minuscolo[x]);
        }
        //trasformo l'array di caratteri a stringa 
        String parolaMinu = new String(minuscolo);
        System.out.print("\nLa parola in minuscolo (oggetto) : ");
        System.out.println(parolaMinu);
    }

}
