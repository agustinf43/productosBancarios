package entities;

public abstract class productoBancario {
    protected int banco;
    protected int sucursal;
    protected int nroProducto;

    private static int contador;

    static{
        contador =0;
    }

    public productoBancario(int banco, int sucursal) {
        this.banco = banco;
        this.sucursal = sucursal;
        this.nroProducto = contador++;
    }

    public nombresBanco getNombreBanco() {
        return nombresBanco.getPorCodigo(banco);
    }

    public int getBanco() {
        return banco;
    }

    public int getSucursal() {
        return sucursal;
    }

    public int getNroProducto() {
        return nroProducto;
    }

    public void setBanco(int banco) {
        this.banco = banco;
    }

    public void setSucursal(int sucursal) {
        this.sucursal = sucursal;
    }






}
