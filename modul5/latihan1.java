/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul5;

/**
 *
 * @author Ideapad 3 14ITL6
 */
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.io.IOException;
    public class latihan1 {    
    public static void main (String[] args){

    //enter word 1
    BufferedReader dataIn = new BufferedReader ( new InputStreamReader(System.in));
    String name = "";
    System.out.print ("Please enter your words 1 = ");
    try {
    name = dataIn.readLine();
    }catch (IOException e){
    System.out.println ("Error !");
    }

    //enter word 2
    BufferedReader dataMasuk = new BufferedReader (new InputStreamReader(System.in));
    String nama ="";
    System.out.print ("Please enter your words 2 = ");
    try{
    nama = dataMasuk.readLine();
    }catch(IOException e){
    System.out.println ("Error !");
    }

//enter 3
BufferedReader dataMlebu = new BufferedReader (new InputStreamReader(System.in));
String namawa ="";
System.out.print("Please enter your words 3 = ");
try{
    namawa = dataMlebu.readLine();
    }catch(IOException e){
    System.out.println ("Error !");
}
    System.out.println (name +" "+ nama +" "+ namawa);
}
}