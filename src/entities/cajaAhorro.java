package entities;

public class cajaAhorro extends productoBancario {



    public cajaAhorro(int banco, int sucursal) {
        super(banco, sucursal);
        this.banco=banco;
        this.sucursal= sucursal;
    }


    public void mostrarInfo() {
        System.out.println("Caja de Ahorro - Banco: " + banco + ", Sucursal: " + sucursal + ", Nº de Producto: " + nroProducto);
    }






}
