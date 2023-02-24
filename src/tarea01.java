package src;

import java.util.Scanner;
public class tarea01{
    public static void main(String[] args){
        Scanner data = new Scanner(System. in);
        System.out.print ("Ingresa tu Nombre, Profesión y País, y separalo con espacio");
        String information = data.nextLine();
        String [] space = information.trim().split(" ");
        for (int i = 0; i < space.length; i++){
            if (i == 0){
                System.out.println("Nombre: " + space[i].toUpperCase());
            } else if (i == 1){
                System.out.println("Profesión: " + space[i].toUpperCase());
            } else if (i == 2){
                System.out.println("País: " + space[i].toUpperCase());
            }

        }

    }
}
