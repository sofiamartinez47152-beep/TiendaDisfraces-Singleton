import java.util.HashMap;
import java.util.Map;
public class GestorAlquilerDisfraces {
    //Atributo estático privado que guarda la única instancia
    private static GestorAlquilerDisfraces instancia;
    //Catálogo de disfraces: clave=nombre del diisfraz, valor=true (si está disponible) o false (si está alquilado)
    private Map<String, Boolean> catalogo;
    //Constructor privado para evitar que se pueda instanciar la clase con 'new' desde afuera
    private GestorAlquilerDisfraces(){
        catalogo = new HashMap<>();
        catalogo.put("Spider-Man (Talle L)", true);
        catalogo.put("Vampiro (Talle S)", true);
        catalogo.put("Pirata (Talle M)", true);
        catalogo.put("Bruja (Talle XL)", true);
    }
    //Metodo estático de acceso público con inicialización diferida
    public static GestorAlquilerDisfraces getInstance(){
        //Si la instancia es nula quiere decir que nadie la creó todavía
        if(instancia == null){
            //Se crea por primera vez
            instancia = new GestorAlquilerDisfraces();
        }
        //Devuelve la instancia que se creó recientemente o que ya estaba creada antes
        return instancia;
    }
    //Metodo para consultar la disponibilidad de disfraces
    public boolean consultarDisponibilidad(String disfraz){
        return catalogo.getOrDefault(disfraz, false);
    }
    //Metodo para alquilar un disfraz
    public boolean alquilarDisfraz(String disfraz, String canal){
        if(!catalogo.containsKey(disfraz)){
            System.out.println("[" +canal+ "] Error: El disfraz '" +disfraz+ "' no existe en el catálogo.");
            return false;
        }
        if(catalogo.get(disfraz)){
            catalogo.put(disfraz, false); //El disfraz que estaba disponible, ahora está ocupado
            System.out.println("[" +canal+ "] Alquiler confirmado: '" +disfraz+ "'.");
            return true;
        }else{
            System.out.println("[" +canal+ "] Rechazado: '" +disfraz+ "' ya se encuentra alquilado.");
            return false;
        }
    }
    //Metodo para devolver un disfraz
    public boolean devolverDisfraz(String disfraz){
        if(!catalogo.containsKey(disfraz)){
            System.out.println("[Devolución] Error: El disfraz '" +disfraz+ "' no pertenece al catálogo.");
            return false;
        }
        if(!catalogo.get(disfraz)){
            catalogo.put(disfraz, true); //El disfraz que estaba ocupado, ahora vuele a estar disponible
            System.out.println("[Devolución] '" +disfraz+ "' devuelto y disponible nuevamente.");
            return true;
        }else{
            System.out.println("[Devolución] Aviso '" +disfraz+ "' ya figuraba como disponible.");
            return false;
        }
    }
    //Metodo para mostrar el catálogo de disfraces
    public void mostrarCatalogo(){
        System.out.println("\nESTADO ACTUAL DEL CATÁLOGO DE DISFRACES:");
        for(Map.Entry<String, Boolean> entry : catalogo.entrySet()){
            String estado = entry.getValue() ? "Disponible" : "Alquilado";
            System.out.println("- " +entry.getKey()+ ": " +estado);
        }
    }
}