/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.saquicela.sarmiento.villa.autos;

/**
 *
 * @author Mauricio Ortiz Ochoa
 */
public class Auto {

    String placa;
    String marca;
    String nombrePropietario;
    int year;
    String color;
    double precio;
    int cilindraje;

    public String mostrarInfo() {
        System.out.println("\n*************************************************\n");
        var retorno = "-El auto tiene placa: " + this.placa + " es de marca: "
                + this.marca + " y el propietario es: " + this.nombrePropietario
                + ". \n-El auto cuesta " + this.precio + " USD y es modelo: "
                + this.year;

        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        var primeraLetra = "";
        primeraLetra = this.placa.substring(0, 1);
        switch (primeraLetra) {
            case "A":
                retorno = "Azuay";
                break;
            case "P":
                retorno = "Pichincha";
                break;
            case "G":
                retorno = "Guayas";
                break;
            case "U":
                retorno = "Cañar";
                break;
            default:
                retorno = "Provincia no definida";
        }
        return retorno;
    }

    public String getPaisMarca() {
        var retorno = "";
        if (this.marca.equals("Chevrolet")) {
            retorno = "EE.UU";
            return retorno;

        } else {
            if (this.marca.equals("Toyota")) {
                retorno = "Japon";
                return retorno;

            } else {
                if (this.marca.equals("Mercedez")) {
                    retorno = "Alemania";
                    return retorno;

                } else {
                    if (this.marca.equals("Jetour")) {
                        retorno = "Japon";
                        return retorno;

                    }

                }

            }

        }
        return retorno;
    }

    public int getNumeroContinente() {
        var retorno = 0;
        var marcaPais = this.getPaisMarca();
        switch (marcaPais) {
            case "E.E.U.U":
                retorno = 2;
                break;
            case "Japon":
                retorno = 3;
                break;

            default:
                retorno = 0;

        }
        return retorno;
    }

    public double calcularIva() {
        var retorno = 0.00d;
        retorno = (this.precio * 0.12);

        return retorno;
    }
//10% por cada año de uso
// La depresiacion nop puede exceder el precio

    public double calcularDepresiacion(int yearActual) {
        var retorno = 0.00d;
        var edad = this.calcularEdad(yearActual);
        retorno = edad * 0.1 * this.precio;
        if (retorno > this.precio) {

        }
        return retorno;
    }

    public int calcularEdad(int yearActual) {
        var retorno = 0;
        retorno = yearActual - this.year;

        return retorno;
    }

    public double calcularCostoMatricula(int yearActual) {
        var retorno = 0.00d;
        var edad = this.calcularEdad(yearActual);

        if ((edad > 0) && (edad <= 5)) {
            retorno = this.precio * 0.1;
        } else {
            if (edad <= 10) {
                retorno = this.precio * 0.08;
            } else {
                if (edad <= 15) {
                    retorno = this.precio * 0.07;

                } else {
                    retorno = this.precio * 0.06;
                }
            }
        }

        return retorno;
    }

    public boolean sePuedeAsegurar() {
        var retorno = false;
        var edad = this.calcularEdad(year);

        if ((edad <= 5) && (this.precio < 10000)) {
            retorno = true;
        } else {
            if (((15 >= edad) && (edad >= 10)) && (this.precio < 20000)) {
                retorno = true;

            } else {
                if (((edad > 15)) && (this.precio < 30000)) {
                    retorno = true;
                } else {
                    if (edad > 15) {
                        retorno = false;
                    }
                }
            }

        }
        return retorno;

    }

    public boolean esClasico() {
        var retorno = false;
        return retorno;
    }

    /*
    Edad 0-5 y cilindraje <1500 : tasa 15% costo
    Edad 0-5 y cilindraje >1500<200 : tasa 
     */
    public double calcularTasSolidaria(int yearActual, double limitePrecio) {
        var retorno = 0.0d;

        return retorno;
    }

    public boolean esPlacaValida() {
        var retorno = false;
        var longitud = this.placa.length();
        if (longitud == 7) {
            var caracter1 = this.placa.charAt(0);
            var caracter2 = this.placa.charAt(1);
            var caracter3 = this.placa.charAt(2);
            var caracter4 = this.placa.charAt(3);
            var caracter5 = this.placa.charAt(4);
            var caracter6 = this.placa.charAt(5);
            var caracter7 = this.placa.charAt(6);
            if (Character.isDigit(caracter4) && Character.isDigit(caracter5)
                    && Character.isDigit(caracter6) && Character.isDigit(caracter7)
                    == true) {

                if (Character.isLetter(caracter1) && Character.isLetter(caracter2)
                        && Character.isLetter(caracter3) == true) {
                    retorno = true;
                }

            } else {

            }

        }
        return retorno;
    }
}
