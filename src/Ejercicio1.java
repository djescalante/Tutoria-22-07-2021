/*
Crea una clase llamada Cuenta que tendrá los siguientes atributos: 
titular y cantidad (puede tener decimales).

El titular será obligatorio y la cantidad es opcional. 
Crea dos constructores que cumpla lo anterior.

Crea sus métodos get, set y toString.

Tendrá dos métodos especiales:

ingresar(double cantidad): se ingresa una cantidad a la cuenta, 
si la cantidad introducida es negativa, no se hará nada.

retirar(double cantidad): se retira una cantidad a la cuenta, 
si restando la cantidad actual a la que nos pasan es negativa,
la cantidad de la cuenta pasa a ser 0.
*/

class Ejercicio1 {

    private String titular;
    private double cantidad;
    
    public Ejercicio1(){}

    public Ejercicio1(String titular){
        this.titular = titular;
        this.cantidad=0;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }

    public void setCantidad(double cantidad){
        if (cantidad<0){
            System.out.println("No se puede ingresar una cantidad negativa");
        }
        else{
            this.cantidad = cantidad;
        }
        
    }

    public String getTitular(){
        return this.titular ;
    }

    public double getCantidad(){
       return this.cantidad ;
    }

    public String toString(){
        return String.format("Titular: %s, Cantidad: %s", this.titular,this.cantidad);
        //return "Titular: " + this.titular + ", Cantidad: " + this.cantidad;
    }

    public void ingresar(double cantidad){
        if (cantidad > 0) {
            this.cantidad = this.cantidad + cantidad;
        }else{
            System.out.println("No se aceptan cantidades negativas...");
        }
    }

    public void retirar(double cantidad){
        double saldo = this.cantidad - cantidad;

        if (saldo < 0) {
            this.cantidad = 0;
        }else{
            this.cantidad = saldo;
        }
    }
    
}
