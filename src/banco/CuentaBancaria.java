package banco;

public class CuentaBancaria {

    private String numeroCuenta;
    private String titular;
    private double saldo;

    //contructor

    public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
    }
    // getter y setters


    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }


    // Protected = solo las hijas pueden usar
    protected void setSaldo(double nuevoSaldo) {
        this.saldo = nuevoSaldo;
    }
    public String describir(){
        return "Cuenta " + numeroCuenta + " · Titular: " +
                titular + " · Saldo: $" + saldo;

    };

    public  double calcularComision(){
        return  0.0;
    }
    public void realizarRetiro(double monto){

        setSaldo(getSaldo()-monto);
    }


}
