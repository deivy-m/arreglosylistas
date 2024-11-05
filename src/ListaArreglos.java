import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaArreglos {
    public static <list> void main(String[] args) {
        //se crea el array
        List<String> listaColores = new ArrayList<>();

        //creacion mediante la clase Array
        String[] nombres = {"Arturo", "Daniel", "Pamela"}; // se puede trasnformar el vector en una lista
        List<String> listaNombres = Arrays.asList(nombres);

        //Adicion de elementos individuales
        listaColores.add("Verda");
        listaColores.add("Amarillo");
        //listaColores.remove();

        //Construir lista a partir de otra
        List<String> listaElementos = new ArrayList<(listaColores)>;

        
    }
}
