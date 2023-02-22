public class CadastroProduto {;
    private String nomeProduto;
    private double precoUnitario;
    private String codigoBarra;

    CadastroProduto(String nomeProduto, double precoUnitario, String codigoBarra, Estoque estoque){
        this.nomeProduto = nomeProduto;
        this.precoUnitario = precoUnitario;
        this.codigoBarra = codigoBarra;
        estoque.produtos.add(this);
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
    
}
