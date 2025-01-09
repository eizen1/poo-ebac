public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();


        /**
         * @author Igor Sousa Bezerra
         */
        cliente.cadastrarCodigo(1);
        cliente.CadastrarNomeCliente("Igor Sousa Bezerra");
        cliente.cadastrarProduto("Fone Jbs");

        System.out.println("Bem vindo");
        System.out.println(cliente.getCodigoCliente());
        System.out.println(cliente.getNomeCliente());
        System.out.println(cliente.getProduto());


    }
}
