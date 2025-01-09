public class Cliente {

    private int codigoCliente;

    private String nomeCliente;

    private String produto;

    public int getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void cadastrarCodigo(int codigoCliente){
        setCodigoCliente(codigoCliente);
    }

    public void CadastrarNomeCliente(String nomeCliente){
        setNomeCliente(nomeCliente);
    }

    public void cadastrarProduto(String produto){
        setProduto(produto);
    }
}
