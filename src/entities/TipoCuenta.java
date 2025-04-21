package entities;

public enum TipoCuenta {

    CA("Caja de Ahorro"), CC("Cuenta Corriente"), TC("Tarjeta de credito");

    private String nombreCuenta;

     TipoCuenta(String nombreCuenta){
        this.nombreCuenta=nombreCuenta;
    }

    public String getNombreCuenta() {
        return nombreCuenta;
    }
}
