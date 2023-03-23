public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente();   // Upcast
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        Vendedor vendedor_ = (Vendedor) new Funcionario(); // Downcast (Erro de propósito)
    }
}