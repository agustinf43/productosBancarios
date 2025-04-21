package entities;
//Dentro de mayor y menor <> van los tipos de datos de los atributos
public class GenericaDosAtributos <K, V> {

    private K codigo;
    private V nombre;

    public GenericaDosAtributos(K codigo, V nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public K getCodigo() {
        return codigo;
    }

    public void setCodigo(K codigo) {
        this.codigo = codigo;
    }

    public V getNombre() {
        return nombre;
    }

    public void setNombre(V nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "GenericaDosAtributos{" +
                "codigo=" + codigo +
                ", nombre=" + nombre +
                '}';
    }
}
