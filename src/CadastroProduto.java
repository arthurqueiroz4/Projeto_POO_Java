public class CadastroProduto {;
    private String nomeProduto;
    private double precoUnitario;
    private String codigoBarra;
    private int quant;

    CadastroProduto(String nomeProduto, double precoUnitario, String codigoBarra, Estoque estoque, int quantidade){
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.codigoBarra = codigoBarra;
        this.quant = quantidade;
        estoque.produtosEstoque.add(this);
    }
    
    public double getPrecoUnitario(){
        return this.precoUnitario;
    }
    public String getCodigoBarra(){
        return this.codigoBarra;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public int getQuantidade(){
        return this.quant;
    }
    public void setQuantidade(int quantidade){
        this.quant = quantidade;
    }
}
