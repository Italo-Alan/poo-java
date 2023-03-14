public class App {
    public static void main(String[] args) throws Exception {
        //Instanciei o objeto normalmente
        Funcionario funcionario = new Funcionario();

        //Upcast implicitos
        //Transforma a classe filha em classe mãe
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        //Downcast
        // Transforma a classe mãe em filha
        //Podemos ver que o que temos abaixo retorna um erro, pois nem tudo que estará na classe filha estará na classe mãe.
        //É recomendado que não devemos trabalhar com downcast
        Vendedor vendedor_ = (Vendedor) new Funcionario();
    }
}
