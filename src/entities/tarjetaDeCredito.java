package entities;

public class tarjetaDeCredito extends productoBancario{

    private int clave;

    public tarjetaDeCredito(int banco, int sucursal, int clave) {
        super(banco, sucursal);
        this.clave=clave;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void mostrarInfo() {
        System.out.println("Tarjeta de Credito - Banco: " + banco + ", Sucursal: " + sucursal + ", Nº de Producto: " + nroProducto);
    }


}
