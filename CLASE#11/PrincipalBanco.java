public class PrincipalBanco {
    public static void main(String[] args) {
        //cuenta válida
        CuentaBancaria cuenta1 = new CuentaBancaria("Kevin Cabrera", "115470", 500);
        System.out.println(cuenta1.toString());

        // depósito y retiro
        cuenta1.depositar(200);
        cuenta1.retirar(100);
        System.out.println("Saldo final: " + cuenta1.getSaldo());

        //cuenta inválida
        CuentaBancaria cuenta2 = new CuentaBancaria("", "12", -50);
        System.out.println("\n" + cuenta2.toString());
        System.out.println("Cuenta creada con datos inválidos.");
    }
}