import java.util.Map;
import java.util.function.Function;


public class Gerenciador {

    Function<Map.Entry<Integer, Livros>, String> formatador = entry -> {

            return "ID: " + entry.getKey() + 
                   " | Nome: " + entry.getValue().getNome()+
                   " | Autor: "+ entry.getValue().getAutor() +
                   " | Quantidade: "+ entry.getValue().getQuantidade();

        };
    
    Function<Map.Entry<Integer, Alunos>, String> formatador2 = entry -> {
        return "ID: " + entry.getKey() + 
               " | Nome: " + entry.getValue().getNome() +
               " | Sala: " + entry.getValue().getSala();   
    };

    public void listarLista(Map<Integer, Livros> lista){
        lista.entrySet().stream()
                        .map(formatador)
                        .forEach(System.out::println);
    }

    public void listarAlunos(Map<Integer, Alunos> alunos){
        alunos.entrySet().stream()
                        .map(formatador2)
                        .forEach(System.out::println);
    }
}
