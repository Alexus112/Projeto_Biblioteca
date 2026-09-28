public class Livros {

    private int id;
    private String nome;
    private String autor;
    private int quantidade;
   

    public Livros(int id, String nome, String autor, int quantidade){
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.quantidade = quantidade; 
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


    public String getAutor() {
        return autor;
    }


    public void setAutor(String autor) {
        this.autor = autor;
    }


    public int getQuantidade() {
        return quantidade;
    }


    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void diminuirQuantidade(){
        if(this.quantidade == 0){
            System.out.println("Este livro está esgotado.");
        } else{
            this.quantidade = this.quantidade - 1;
        }
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " | Nome: " + this.nome + " | Autor: " + this.autor + " | Quantidade: " + this.quantidade; 
    }
}
