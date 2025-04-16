package entities;

public enum nombresBanco {

    SANTA_FE(1, "Banco Santa Fe"),
    NACION(2, "Banco Nación"),
    GALICIA(3, "Banco Galicia");

    private final int CODIGO;
    private final String NOMBRE;


    nombresBanco(int codigo, String nombre) {
        this.CODIGO = codigo;
        this.NOMBRE = nombre;
    }




    public String getNombre() {
        return NOMBRE;
    }

    public int getCodigo() {
        return CODIGO;
    }


    // Método estático para buscar banco por código
    public static nombresBanco getPorCodigo(int CODIGO) {
        for (nombresBanco i : nombresBanco.values()) {
            if (i.getCodigo() == CODIGO) {
                return i;
            }
        }
        throw new NullPointerException();
    }


}
