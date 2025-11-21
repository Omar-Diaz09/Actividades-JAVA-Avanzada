package modelos;

public class ElementoInventario {
    private String codigo;
    private final String nombre;
    private final String tipo; // Ej: "Broca", "Grasa", "Cortador"
    private final String descripcion;
    private int cantidadStock;
    private final String unidadMedida; // Ej: "piezas", "litros"
    private final String maquinariaCompatible; // Ej: "Torno", "Perfiladora"
    private final String colorGrasa; // Para grasas específicas

    // Constructor
    public ElementoInventario(String codigo, String nombre, String tipo, String descripcion, int cantidadStock, String unidadMedida, String maquinariaCompatible, String colorGrasa) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.cantidadStock = cantidadStock;
        this.unidadMedida = unidadMedida;
        this.maquinariaCompatible = maquinariaCompatible;
        this.colorGrasa = colorGrasa;
    }

    // Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }
    
    // ... (otros getters y setters para los demás atributos) ...

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "ElementoInventario{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
