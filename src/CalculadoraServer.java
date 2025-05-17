import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculadoraServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);

            Calculadora calculadora = new CalculadoraImpl();

            Naming.rebind("rmi://localhost:1099/CalculadoraService", calculadora);

            System.out.println("servidor RMI pronto e aguardando conexões...");
        } catch (Exception e) {
            System.err.println("erro no servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
