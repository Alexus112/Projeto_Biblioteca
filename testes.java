import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class testes {
    public static void main(String[] args) {

        Map<String, Livros> lista = new HashMap<>();
        Scanner scanner = new Scanner(System.in); // Adicionado para ler a entrada do usuário

        int op = -1;

        while(op != 0){
            System.out.println("\nPor favor, escolha uma opcao: ");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Listar Livros");
            System.out.println("0 - Sair");
            
            op = scanner.nextInt(); // Lê a opção do usuário
            scanner.nextLine(); // Limpa o buffer do teclado

            switch (op) {
                case 1:
                    System.out.print("Digite o ID do livro: ");
                    String id = scanner.nextLine();
                    
                    System.out.print("Digite o nome do livro: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    
                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    
                    // Adiciona o livro ao Map
                    lista.put(id, new Livros(nome, autor, qtd));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:
                    Gerenciador gerente = new Gerenciador();
                    if(lista.isEmpty()) {
                        System.out.println("A lista de livros esta vazia!");
                    } else {
                        gerente.listarLista(lista);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
                    
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }
        scanner.close();
    }
}