/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tamagochi1;

import java.util.Scanner;

/**
 * @author Cristina
 */
public abstract class Tamagotchi {
    private String nombre; //nombre del Tamagochi
    private byte hambre; //hambre del Tamagochi
    private byte sueño; //Sueño del Tamagochi
    private byte higiene; // suciedad del Tamagochi
    private byte diversion;  //aburrimiento del Tamagochi





    public Tamagotchi(String nombre) {
        this.nombre = nombre;
        this.hambre = 100;
        this.sueño = 100;
        this.higiene = 100;
        this.diversion = 100;
    }
    /**
     * Constructor del Tamagochi
     *
     * @param nombre
     * @param hambre
     * @param sueño
     * @param higiene
     * @param diversion
     */
    public Tamagotchi(String nombre, byte hambre, byte sueño, byte higiene, byte diversion) {
        this.nombre = nombre;
        this.hambre = hambre;
        this.sueño = sueño;
        this.higiene = higiene;
        this.diversion = diversion;
    }

    /**
     * getter de nombre
     *
     * @return nombre del Tamagochi
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setter de nombre
     *
     * @param nombre nombre del Tamagochi
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getter de hambre
     *
     * @return hambre del Tamagochi
     */
    public byte getHambre() {
        return hambre;
    }

    /**
     * setter de hambre
     *
     * @param hambre hambre del Tamagochi
     */
    public void setHambre(Byte hambre) {
        this.hambre = hambre;
    }

    /**
     * getter de sueño
     *
     * @return sueño del Tamagochi
     */
    public byte getSueño() {
        return sueño;
    }

    /**
     * setter de sueño
     *
     * @param sueño suelo del Tamagochi
     */
    public void setSueño(byte sueño) {
        this.sueño = sueño;
    }

    /**
     * getter de higiene
     *
     * @return devuelve higiene del Tamagochi
     */
    public Byte getHigiene() {
        return higiene;
    }

    /**
     * setter de higiene
     *
     * @param higiene
     */
    public void setHigiene(Byte higiene) {
        this.higiene = higiene;
    }

    public Byte getDiversion() {
        return diversion;
    }

    public void setDiversion(byte diversion) {
        this.diversion = diversion;
    }

    public final static Tamagotchi nacer() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una raza:");
        String raza = sc.nextLine();
        System.out.println("Dime un nombre");
        String nombre = sc.nextLine();

        switch (raza) {
            case "Perro":
                Tamagotchi perro = new Perro(nombre);
                Main.isRaza = true;
                return perro;

            case "Pez":
                Tamagotchi pez  = new Pez(nombre);
                Main.isRaza = true;
                return pez;

            case "Pajaro":
                Tamagotchi pajaro  = new Pajaro(nombre);
                Main.isRaza = true;
                return pajaro;
            default:
                Main.isRaza = false;
        }
        return null;
    }


    @Override
    public String toString() {
        return
                "Hambre - " + hambre + "\n" +
                        "Sueno - " + sueño + "\n" +
                        "Higiene - " + higiene + "\n" +
                        "Diversion - " + diversion;
    }

    public void vivir() {
        hambre -= 5;
        sueño -= 5;
        higiene -= 5;
        diversion -= 5;
    }

    public boolean seHaMuerto() {
        if (hambre == 0 || sueño == 0 || higiene == 0 || diversion == 0) {
            return true;
        }
        return false;
    }

    public void comer() {
        hambre += 15;
    }

    public void dormir() {
        sueño += 15;
    }

    public void bañarse() {
        higiene += 15;
    }

    public void jugar() {
        diversion += 15;
    }


}
