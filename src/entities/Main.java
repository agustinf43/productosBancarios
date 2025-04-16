package entities;

public class Main {
    public static void main(String[] args){

        cajaAhorro caja1 = new cajaAhorro(1,1);
        cuentaCorriente cc1 = new cuentaCorriente(1, 1);
        tarjetaDeCredito tc1 = new tarjetaDeCredito(2,2,444);

        caja1.mostrarInfo();
        System.out.println(cc1.getNroProducto());

        try{
            System.out.println("Esta tarjeta es del banco: " + tc1.getNombreBanco());
        }catch (NullPointerException e ){
            System.out.println("No se encuentra el nombre del banco");
        }




    }
}