public class Livros {

    private String nome;
    private String autor;
    private int quantidade;
   

    public Livros(String nome, String autor, int quantidade){
        this.nome = nome;
        this.autor = autor;
        this.quantidade = quantidade;
       
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }

    public String getNome(){
        return nome;
    }

    public String getAutor(){
        return autor;
    }

    public int getQuantidade(){
        return quantidade;
    }

}
