public class Fornecedor implements Cloneable{

    private String nome;
    private String cidade;

    public Fornecedor(String nome, String cidade){
        super();
        this.nome = nome;
        this.cidade = cidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override
    public String toString(){
        return "Fornecedor{" +
                "nome=" + '\'' + nome + '\'' +
                ", cidade=" + cidade +
                "}";
    }
}
