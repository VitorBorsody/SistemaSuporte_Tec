//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System s1 = new System();
        Client c1 = new Client("Vitor", 10, "Erro de conexão!");
        Client c2 = new Client("Ana", 11, "Sistema travado!");
        s1.AdicionarChamado(c1);
        s1.AdicionarChamado(c2);
        s1.displayInfo();
        s1.isNull();
        s1.queueSize();


    }
}