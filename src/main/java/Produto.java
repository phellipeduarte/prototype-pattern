public class Produto implements Cloneable{

    private String codigoDeBarras;
    private String nome;
    private Double preco;
    private Fornecedor fornecedor;

    public Produto(String codigoDeBarras, String nome, Double preco, Fornecedor fornecedor){
        this.codigoDeBarras = codigoDeBarras;
        this.nome = nome;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public String getCodigoDeBarras() {
        return codigoDeBarras;
    }

    public void setCodigoDeBarras(String codigoDeBarras) {
        this.codigoDeBarras = codigoDeBarras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public Produto clone() throws CloneNotSupportedException{
        Produto produtoClone = (Produto) super.clone();
        produtoClone.fornecedor = (Fornecedor) produtoClone.fornecedor.clone();
        return produtoClone;
    }

    @Override
    public String toString(){
        return "Produto{" +
                "codigoDeBarras=" + codigoDeBarras +
                ", nome=" + '\'' +  nome + '\'' +
                ", preco=" + '\'' + preco + '\'' +
                ", fornecedor=" + fornecedor + '\'' +
                "}";
    }
}
