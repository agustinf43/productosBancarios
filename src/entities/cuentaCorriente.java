package entities;

public class cuentaCorriente extends productoBancario {


    public cuentaCorriente(int banco, int sucursal) {
        super(banco, sucursal);

    }

    public void mostrarInfo() {
        System.out.println("Cuenta Corriente - Banco: " + super.getBanco() + ", Sucursal: " + super.getSucursal() + ", Nº de Producto: " + super.getNroProducto());
    }
}
