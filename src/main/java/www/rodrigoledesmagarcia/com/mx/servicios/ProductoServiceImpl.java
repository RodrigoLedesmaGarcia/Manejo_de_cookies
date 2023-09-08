package www.rodrigoledesmagarcia.com.mx.servicios;
import www.rodrigoledesmagarcia.com.mx.modelos.Producto;
import java.util.Arrays;
import java.util.List;
public class ProductoServiceImpl implements ProductoService{
    @Override
    public List<Producto> listar() {
        return Arrays.asList(new Producto(1L, "NOTEBOOK", "computacion", 1750),
                             new Producto(2L, "mesa escritorio", "oficina", 5000),
                             new Producto(3L, "teclado mecanico", "computacion", 56565),
                             new Producto(5L, "licuadora", "electrodomesticos", 565),
                             new Producto(6L, "pantalla 4k", "entretenimiento", 10000),
                             new Producto(7L, "computadora HP", "computacion", 75000),
                             new Producto(8L, "lavadora", "electrodomesticos", 1065),
                             new Producto(9L, "bicicleta", "deportes", 565),
                             new Producto(10L, "jabon", "higiene personal", 100),
                             new Producto(11L, "telefono celular", "entretenimiento", 20000),
                             new Producto(12L, "pantalla 8k", "entretenimiento", 25000),
                             new Producto(13L, "zapatos oxford", "ropa", 700),
                             new Producto(14L, "horno de microondas", "electrodomesticos", 3500),
                             new Producto(15L, "mouse laser", "computacion", 800),
                             new Producto(16L, "ps5", "entretenimiento", 15000));



    }
}
