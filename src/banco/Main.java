package banco;

public class Main {
    public static void main(String[] args) {


        CuentaBancaria c1 = new CuentaAhorros("01","Jose",900000,2,200);
        CuentaBancaria c2 = new CuentaCorriente("02","Luis",20000,2,300);
        CuentaBancaria c3 = new CuentaInversion("03","Jeiny",500,1.5,6,100);

        //polimorfismo
        System.out.println(c1.describir());
        System.out.println(c2.describir());
        System.out.println(c3.describir());
        System.out.println("--------------------------------------");

        System.out.println("Comisión c1: " + c1.calcularComision());
        System.out.println("Comisión c2: " + c2.calcularComision());
        System.out.println("Comisión c3: " + c3.calcularComision());
        System.out.println("--------------------------------------");

        c1.realizarRetiro(500000); //saldo nuevo
        System.out.println("Saldo c1: " +c1.getSaldo());

        c2.realizarRetiro(500000);
        System.out.println("Saldo c2: " +c2.getSaldo());

        c3.realizarRetiro(500000);
        System.out.println("Saldo c3: " +c3.getSaldo());








    }
}
