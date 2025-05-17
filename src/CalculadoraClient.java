import java.rmi.Naming;

public class CalculadoraClient {
    public static void main(String[] args) {
        try {
            Calculadora calculadora = (Calculadora) Naming.lookup("rmi://localhost:1099/CalculadoraService");

            System.out.println("5 + 3 = " + calculadora.somar(5, 3));
            System.out.println("10 - 2 = " + calculadora.subtrair(10, 2));
            System.out.println("4 * 6 = " + calculadora.multiplicar(4, 6));
            System.out.println("8 / 2 = " + calculadora.dividir(8, 2));
        } catch (Exception e) {
            System.err.println("erro no cliente: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
