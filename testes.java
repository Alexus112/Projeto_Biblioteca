import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Testes {
    public static void main(String[] args) {

        Map<Integer, Livros> livros = new HashMap<>();
        Map<Integer, Alunos> alunos = new HashMap<>();
        Gerenciador gerente = new Gerenciador();
        Scanner scanner = new Scanner(System.in);

        int op = -1;

        while(op != 0){
            System.out.println("\nPor favor, escolha uma opcao: ");
            System.out.println("1 - Cadastrar Livros");
            System.out.println("2 - Listar Livros");
            System.out.println("3 - Cadastrar Alunos");
            System.out.println("4 - Listar Alunos");
            System.out.println("5 - Emprestar Livros");
            System.out.println("6 - Livros Emprestados");
            System.out.println("0 - Sair");
            
            op = scanner.nextInt();
            scanner.nextLine(); 

            switch (op) {
                case 1:

                    System.out.print("Digite o ID do livro: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Digite o nome do livro: ");
                    String nome = scanner.nextLine();
                    
                    System.out.print("Digite o autor do livro: ");
                    String autor = scanner.nextLine();
                    
                    System.out.print("Digite a quantidade: ");
                    int qtd = scanner.nextInt();
                    
                  
                    livros.put(id, new Livros(id, nome, autor, qtd));
                    System.out.println("Livro cadastrado com sucesso!");
                    break;

                case 2:

                    if(livros.isEmpty()) {
                        System.out.println("A lista de livros esta vazia!");
                    } else {
                        gerente.listarLivros(livros);
                    }
                    break;
                
                case 3:
                    
                    System.out.print("Digite o ID do aluno: ");
                    int idA = scanner.nextInt();
                    scanner.nextLine();
                    
                    System.out.print("Digite o nome do Aluno: ");
                    String nomeA = scanner.nextLine();
                    
                    System.out.print("Digite a sala do Aluno: ");
                    String sala = scanner.nextLine();
                    
                    alunos.put(idA, new Alunos(idA, nomeA, sala));
                    System.out.println("Aluno cadastrado com sucesso!");
                    break;
                
                case 4:

                    if(alunos.isEmpty()){
                        System.out.println("A lista de alunos esta vazia!");
                    } else {
                        gerente.listarAlunos(alunos);
                    }
                    break;

                case 5:

                    System.out.println("Insira o ID do Aluno: ");
                    int idA3 = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Insira o ID do Livro");
                    int idL = scanner.nextInt();
                    scanner.nextLine();

                    gerente.emprestarLivro(livros, alunos, idA3, idL);

                    break;

                case 6:
                    System.out.println("Insira o ID do aluno: ");
                    int idA2 = scanner.nextInt();
                    scanner.nextLine();
                    gerente.listarLivrosEmprestados(alunos, idA2);
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