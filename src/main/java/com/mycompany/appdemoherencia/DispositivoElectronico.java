/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.appdemoherencia;

import java.util.ArrayList;

/**
 *
 * @author Leo
 */
public abstract class DispositivoElectronico {
    //Atributos inmutables
    protected String fabricante;
    protected String numeroSerie;
    protected String marca;
    protected String nombre;
    //Atributos mutables
    protected float costo;
    protected ArrayList<ComponenteElectronico> componentes;
    //Constructor
    public DispositivoElectronico(String fabricante, String numeroSerie, String marca, String nombre, float costo) {
        this.fabricante = fabricante;
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.nombre = nombre;
        this.costo = costo;
        this.componentes = new ArrayList<>();
    }
    //Métodos entorno a los componentes
    public void agregarComponente (ComponenteElectronico nuevoComponente)
    {
        componentes.add(nuevoComponente);
    }
    public void quitarComponente (int index)
    {
        componentes.remove(index);
    }
    //Getters
    public String getFabricante() {
        return fabricante;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public float getCosto() {
        return costo;
    }

    public ArrayList<ComponenteElectronico> getComponentes() {
        return componentes;
    }
    //Setters
    public void setCosto(float costo) {
        this.costo = costo;
    }

    public void setComponentes(ArrayList<ComponenteElectronico> componentes) {
        this.componentes = componentes;
    }
    @Override
    public String toString ()
    {
        String salida;
        salida = "Dispositivo electronico " + this.nombre + "\n";
        salida += "Número de serie: " + this.numeroSerie + "\n";
        salida += "Marca: " + this.marca + "\n";
        salida += "Fabricante: " + this.fabricante + "\n";
        return salida;
    }
}
