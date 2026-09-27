import java.util.Map;
import java.util.function.Function;


public class Gerenciador {

    Function<Map.Entry<String, Livros>, String> formatador = entry -> {

            return "ID: " + entry.getKey() + 
                   " | Nome: " + entry.getValue().getNome()+
                   " | Autor: "+ entry.getValue().getAutor() +
                   " | Quantidade: "+ entry.getValue().getQuantidade();

        };

    public void listarLista(Map<String, Livros> lista){
        lista.entrySet().stream()
                        .map(formatador)
                        .forEach(System.out::println);
    } 
}
