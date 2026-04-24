package banco;

public class CuentaCorriente extends CuentaBancaria {

    private double comisionPorTransaccion;
    private double limiteSobregiro;


    //contructor
    public CuentaCorriente(String numeroCuenta, String titular,
                           double saldo, double comisionPorTransaccion,
                           double limiteSobregiro) {
        super(numeroCuenta, titular, saldo);
        this.comisionPorTransaccion = comisionPorTransaccion;
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public String describir() {
        return super.describir() + "comisión por transacción $: "
                + comisionPorTransaccion;
    }

    @Override
    public double calcularComision() {
        return comisionPorTransaccion;
    }

    public void realizarRetiro(double monto){
        double total = monto + comisionPorTransaccion;
        double nuevoSaldo = getSaldo() -total;

        //validación (limitar la deuda)
        if(nuevoSaldo < -limiteSobregiro){
            System.out.println("no es posible realizar el retiro, excediste la deuda ");
            return;
        }
        setSaldo(nuevoSaldo);
    }

    //  0 = no debes nada
    // -50.000 = debes 50 mil
    // -200.000 = máximo permitido
}


