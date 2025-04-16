package entities;

public class cuentaCorriente extends productoBancario {


    public cuentaCorriente(int banco, int sucursal) {
        super(banco, sucursal);
        this.banco=banco;
        this.sucursal= sucursal;
    }

    public void mostrarInfo() {
        System.out.println("Cuenta Corriente - Banco: " + banco + ", Sucursal: " + sucursal + ", Nº de Producto: " + nroProducto);
    }
}
