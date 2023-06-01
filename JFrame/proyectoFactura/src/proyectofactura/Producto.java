
package proyectofactura;

public class Producto {
    private String id;
    private String nombre;
    private int precio;
    private int cantidad_inventario;
    
    public Producto(String id, String nombre, int precio, int cantidad_inventario) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad_inventario = cantidad_inventario;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad_inventario() {
        return cantidad_inventario;
    }

    public void setCantidad_inventario(int cantidad_inventario) {
        this.cantidad_inventario = cantidad_inventario;
    }
    
    
    
    
    
}
