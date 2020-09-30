package com.company;
import java.util.Scanner; //importo la llibreria que em permet la entrada del teclat
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner teclat = new Scanner(System.in); //anomeno una variable per l'escaner i initzalitzo el mateix
        System.out.println("Escriu el numero de graus Fahrenheit que vols convertir a graus Celcius:");
        int grausFahrenheit  = teclat.nextInt(); //demano els graus fahrenheit al usuari
        int grausCelcius = ((grausFahrenheit -32)*5)/9; //defineixo el nom de la variable de el calcul per pasar a graus celcius
        System.out.println(grausFahrenheit +"°F" + " son: " + grausCelcius +"°C graus celcius" ); //mostro el resultat de el calcul


    }
}
