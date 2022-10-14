/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.saquicela.sarmiento.villa.autos;

/**
 *
 * @author PC-08
 */
public class SaquicelaSarmientoVillaAutos {

    public static void main(String[] args) {
        var auto1 = new Auto();
        auto1.placa = "ABF8592";
        auto1.marca = "Chevrolet";
        auto1.nombrePropietario = "Juana Moreno";
        auto1.precio = 15200;
        auto1.color = "Amarillo";
        auto1.year = 2017;

        System.out.println(auto1.mostrarInfo() + ". \n-El país de origen de la marca es " + auto1.getPaisMarca());
        System.out.println("-La provincia de matrícula es: " + auto1.getProvincia());
        System.out.println("-El auto tiene" + auto1.calcularEdad(2022) + " años");
        System.out.println("-El numero de continente es: " + auto1.getNumeroContinente());
        System.out.println("-El costo de la matricula es: $" + auto1.calcularCostoMatricula(2022));
        System.out.println("-El valor del Iva de su ato es: $" + auto1.calcularIva());
        System.out.println("-El valor de la depresiación es: $" + auto1.calcularDepresiacion(2022));
        System.out.println("-Los años de vida de su auto es: " + auto1.calcularEdad(2022));
        System.out.println("-Tiene seguro: " + auto1.sePuedeAsegurar());
        System.out.println("-Su placa es: " + auto1.esPlacaValida());

        var auto2 = new Auto();
        auto2.placa = "GDX0422";
        auto2.marca = "Toyota";
        auto2.nombrePropietario = "Mariana Ortiz";
        auto2.color = "Gris";
        auto2.precio = 13000;
        auto2.year = 2019;

        System.out.println(auto2.mostrarInfo() + ". \n-El país de origen de la marca es " + auto2.getPaisMarca());
        System.out.println("-La provincia de matrícula es: " + auto2.getProvincia());
        System.out.println("-El auto tiene" + auto2.calcularEdad(2022) + " años");
        System.out.println("-El numero de continente es: " + auto2.getNumeroContinente());
        System.out.println("-El costo de la matricula es: $" + auto2.calcularCostoMatricula(2022));
        System.out.println("-El valor del Iva de su ato es: $" + auto2.calcularIva());
        System.out.println("-El valor de la depresiación es: $" + auto2.calcularDepresiacion(2022));
        System.out.println("-Los años de vida de su auto es: " + auto2.calcularEdad(2022));
        System.out.println("-Tiene seguro: " + auto2.sePuedeAsegurar());
        System.out.println("-Su placa es: " + auto2.esPlacaValida());

        var auto3 = new Auto();
        auto3.placa = "UBH0025";
        auto3.marca = "Jetour";
        auto3.nombrePropietario = "Juan Ortiz";
        auto3.color = "Blanco";
        auto3.precio = 9000;
        auto3.year = 2004;

        System.out.println(auto3.mostrarInfo() + "." + "\n-El país de origen de la marca es " + auto3.getPaisMarca());
        System.out.println("-La provincia de matrícula es: " + auto3.getProvincia());
        System.out.println("-El auto tiene " + auto3.calcularEdad(2022) + " años");
        System.out.println("-El numero de continente es: " + auto3.getNumeroContinente());
        System.out.println("-El costo de la matricula es: $" + auto3.calcularCostoMatricula(2022));
        System.out.println("-El valor del Iva de su ato es: $" + auto3.calcularIva());
        System.out.println("-El valor de la depresiación es: $" + auto3.calcularDepresiacion(2022));
        System.out.println("-Los años de vida de su auto es: " + auto3.calcularEdad(2022));
        System.out.println("-Tiene seguro: " + auto3.sePuedeAsegurar());
        System.out.println("-Su placa es: " + auto3.esPlacaValida());
        
        
    }
}
