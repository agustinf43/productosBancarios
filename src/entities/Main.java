package entities;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        cajaAhorro caja1 = new cajaAhorro(1,1);
        cuentaCorriente cc1 = new cuentaCorriente(1, 1);
        tarjetaDeCredito tc1 = new tarjetaDeCredito(2,2,444);

        //accede al enum por su nombre
        caja1.setTipocuenta(TipoCuenta.CA);
        cc1.setTipocuenta(TipoCuenta.CC);
        tc1.setTipocuenta(TipoCuenta.TC);

        System.out.println("Value of CC :" + TipoCuenta.valueOf( "CC"));
        System.out.println("values ");

        for(TipoCuenta tipo : TipoCuenta.values())
        {
            System.out.println(tipo + " "+ tipo.name() + " "+ tipo.ordinal());
        }
        caja1.mostrarInfo();
        System.out.println(cc1.getNroProducto());



        try{
            System.out.println("Esta tarjeta es del banco: " + tc1.getNombreBanco());
        }catch (NullPointerException e ){
            System.out.println("No se encuentra el nombre del banco");
        }


        //GenericaDosAtributos ejemplo1 = new GenericaDosAtributos(1234, "Hola mundo");

        GenericaDosAtributos<Integer,String> ejemplo2 = new GenericaDosAtributos (123, "hola");

        //lista de tipo array(posicional)
        List<cajaAhorro> listaCa = new ArrayList<>();
        listaCa.add(new cajaAhorro(3, 1));
        listaCa.add(new cajaAhorro(2, 2));
        listaCa.add(new cajaAhorro(1, 2));
        listaCa.add(new cajaAhorro(2, 3));
        listaCa.add(new cajaAhorro(3, 1));
        //size tamaño de la lista
        System.out.println("Cantidad de cajas de ahorro:  "+ listaCa.size());

        Iterator<cajaAhorro> it = listaCa.iterator();
        while(it.hasNext()){
            cajaAhorro ca = it.next();
            ca.mostrarInfo();
        }
    }
}