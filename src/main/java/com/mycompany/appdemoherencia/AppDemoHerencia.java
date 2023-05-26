/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.appdemoherencia;

import java.util.ArrayList;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
/**
 *
 * @author Leo
 */
public class AppDemoHerencia {

    public static void main(String[] args) {
        //Declaración de variables.
       ArrayList<Smartphone> listaDeSmartphones;
       ArrayList<Televisión> listaDeTVs;
       //Inicialización de la lista de smartphones
       listaDeSmartphones = new ArrayList<>();
       //Primer smartphone
       listaDeSmartphones.add(new Smartphone("Motorola" ,"1182582", "Motorola", "Moto E50", 5000.00f, 100000,
       new MicroProcesador(8, 1000, "Motorola", "1173432", "Motorola", 500f),
       new Pantalla (1000, 500, "Motorola", "1231231", "Motorola", 200),
       new Sensor ("huella", "pixeles", 0, "Motorola", "8762453", "Motorola", 2.45f)
       ));
       //Segundo smartphone
       listaDeSmartphones.add(new Smartphone("Huawei" ,"7365412", "Huawei", "HUAWEI p60 pro", 7000.00f, 300000,
       new MicroProcesador(16, 2000, "Huawei", "8872563", "Huawei", 750f),
       new Pantalla (1250, 750, "Huawei", "9876465", "Huawei", 250f),
       new Sensor ("huella", "pixeles", 0, "Huawei", "9968756", "Huawei", 2.5f)
       ));
       //Inicialización de tv
       listaDeTVs = new ArrayList<>();
       listaDeTVs.add(new Televisión("Roku", "5742938", "Roku", 10000.00f,
       new Pantalla(2000, 1000, "Roku", "8374521", "Roku", 530.00f)));
       //Segundo televisor
       listaDeTVs.add(new Televisión("Sony", "6627321", "Sony", 200000.00f, 
       new Pantalla(2500, 1500, "Sony", "8832652", "Sony",  750.00f)));
       //Impresión de las listas.
       int contador = 1;
       for (Smartphone i:listaDeSmartphones)
       {
           System.out.println("Articulo " + contador + ": ");
           System.out.println(i.toString());
           contador++;
       }
       for (Televisión i:listaDeTVs)
       {
          System.out.println("Articulo " + contador + ": ");
          System.out.println(i.toString());
          contador++; 
       }
        
    }
}
