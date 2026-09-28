import java.util.HashMap;
import java.util.Map;

public class Alunos {

    private int id;
    private String nome;
    private String sala;
    private Map<Integer, Livros> livrosPegos = new HashMap<>();

    public Alunos(int id, String nome, String sala){
        this.id = id;
        this.nome = nome;
        this.sala = sala;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Map<Integer, Livros> getLivros(){
        return livrosPegos;
    }

    public void guardarLivro(Livros livro){
        int livroid = livro.getId();
        livrosPegos.put(livroid, livro);
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " | Nome: " + this.nome + " | Sala: " + this.sala; 
    }

}
