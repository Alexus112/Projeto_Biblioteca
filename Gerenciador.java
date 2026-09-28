import java.util.Map;

public class Gerenciador {

    public void listarLivros(Map<Integer, Livros> lista) {
        lista.values().stream()
                .forEach(System.out::println);
    }

    public void listarAlunos(Map<Integer, Alunos> alunos) {
        alunos.values().stream()
                .forEach(System.out::println);
    }

    public void listarLivrosEmprestados(Map<Integer, Alunos> alunos, int idAluno){
        Alunos aluno = alunos.get(idAluno);

        if(aluno == null){
            System.out.println("ERRO: ID do aluno não existe.");
            return;
        }

        if(aluno.getLivros().isEmpty()){
            System.out.println("Este aluno nao pegou nenhum livro.");
        } else{
            aluno.getLivros().values().stream()
                                      .forEach(System.out::println);
        }
    }

    public void emprestarLivro(Map<Integer, Livros> livros, Map<Integer, Alunos> alunos, int idAluno, int idLivro) {

        Alunos aluno = alunos.get(idAluno);
        Livros livro = livros.get(idLivro); 

        if (aluno == null) {
            System.out.println("ERRO: Aluno não encontrado com este ID.");
            return; 
        }

        if (livro == null) {
            System.out.println("ERRO: Livro não encontrado com este ID.");
            return;
        }

        if (livro.getQuantidade() <= 0) {
            System.out.println("O livro '" + livro.getNome() + "' está fora de estoque no momento.");
        } else {
            aluno.guardarLivro(livro);
            livro.diminuirQuantidade();
            System.out.println(
                    "Livro '" + livro.getNome() + "' emprestado com sucesso para o aluno " + aluno.getNome() + "!");
        }
    }
}
