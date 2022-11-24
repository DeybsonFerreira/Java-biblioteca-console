package Biblioteca;

import java.io.IOException;
import java.util.Scanner;

import Biblioteca.Menus.Menu;


public class Main {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();
        menu.menuPrincipal();

    }
}