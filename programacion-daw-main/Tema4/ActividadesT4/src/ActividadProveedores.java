package ActividadesT4.src;

public class ActividadProveedores {
    //Crear categoria
    Categoria categoria = new Categoria("pieza1", 1);
    //Crear proveedor 
    Proveedor proveedor = new Proveedor("calle", "albox", "almeria", 1);
    //Crear pieza
    Pieza pieza = new Pieza("Alicate", "Verde", 19.99, 1);

    Pieza.setCategoria(cat);

    //Relacion de suministra
    Proveedor_suministra_pieza suministra_pieza = new Proveedor_suministra_pieza(pieza,proveedor,30,"17/11/2025");
}
