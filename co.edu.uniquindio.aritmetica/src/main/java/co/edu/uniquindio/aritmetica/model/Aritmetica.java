package co.edu.uniquindio.aritmetica.model;

public class Aritmetica {

    /**
     * Metodo para sumar dos numeros
     * @param numero1
     * @param numero2
     * @return int
     */
    public int sumarDosNumeros(int numero1, int numero2){
        int suma = 0;
        suma = numero1 + numero2;
        return suma;
    }

    /**
     * Metodo para restar dos numeros
     * @param numero1
     * @param numero2
     * @return int
     */

    public int restarDosNumeros(int numero1, int numero2){
        int suma = 0;
        suma = numero1 - numero2;
        return suma;
    }

    /**
     * Metodo para dividir dos numeros
     * @param numero1
     * @param numero2
     * @return int
     */

    public int dividirDosNumeros(int numero1, int numero2){
        int suma = 0;
        suma = numero1 / numero2;
        return suma;

    }

    /**
     * Metodo para promediar dos numeros
     * @param numero1
     * @param numero2
     * @return double
     */

    public double promedioDosNumeros(double numero1, double numero2){
        double suma = 0;
        suma = (numero1 + numero2) / 2;
        return suma;
    }


}

