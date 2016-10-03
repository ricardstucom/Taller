import java.util.*;

public class RegistroVehiculos {
    private Set<Coche> coches = new HashSet<>();

    public void registrarVehiculo(Coche coche){
    coches.add(coche);

    }

    // Optional<Coche> es una nueva funcionalidad de Java 8 para evitar trabajar con null
    // Lo puedes omitir si trabajas con Java 7
    public Coche obtenerVehiculo(String matricula) {
        Coche aux=null;

        for (Coche coche : coches) {
            if (coche.getMatricula().equals(matricula)) {
               aux = coche;
            }
        }
        if(aux!=null){
            return aux;
        }
        return null;    }

    public void eliminarVehiculo(String matricula){
    Coche aux=null;
        for(Coche coche : coches){
            if(coche.getMatricula().equals(matricula)){
                aux = coche;
            }

        }
if(aux!=null){
    coches.remove(aux);
}
    }


    public Coche obtenerVehiculoPrecioMax() {
        Integer aux = 0;
        Coche aux2 = null;
        for (Coche coche : coches) {
            if (coche.getPrecio() >= aux) {
                aux = coche.getPrecio();
            }
        }
        for (Coche coche : coches) {
            if (coche.getPrecio().equals(aux)) {
                aux2 = coche;
            }
        }
       if(aux2!=null) {
           return aux2;
       }
return null;
    }
    public List<Coche> obtenerVehiculosMarca(String marca){
        List<Coche> aux = new ArrayList<>();

    for(Coche coche : coches){
        if(coche.getMarca().equals(marca)){
            aux.add(coche);
        }
    }
    return aux;
    }

    public List<Coche> obtenerTodos() {
        return new ArrayList<>(coches);
    }
    }