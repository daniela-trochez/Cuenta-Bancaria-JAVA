package banco;

public class CuentaAhorros extends CuentaBancaria {

    private double tasaInteresMensual;
    private  double saldoMinimo;

    public CuentaAhorros(String numeroCuenta, String titular, double saldo,
                         double tasaInteresMensual, double saldoMinimo) {
        super(numeroCuenta, titular, saldo);

        this.tasaInteresMensual = tasaInteresMensual;
        this.saldoMinimo = saldoMinimo;
    }
    @Override
    public String describir(){
        return super.describir() + " --tasa mensual: "+tasaInteresMensual+"%";

    }

    @Override
    public double calcularComision() {
        if(getSaldo() >= saldoMinimo){
            return 0.0;
        }else {
            return 12000.0;
            // multa por no tener el saldo minimo que exige la cuenta
        }
    }

    public void realizarRetiro(double monto, boolean esUrgente){
        double nuevoSaldo = getSaldo() - monto;
        if(esUrgente && nuevoSaldo < saldoMinimo){
            nuevoSaldo = nuevoSaldo- 12000.0;
            // abreviado ..... nuevoSaldo -= 12000.0;
        }
        setSaldo(nuevoSaldo);
    }


    public double calcularInteresMes(){
        return getSaldo() * tasaInteresMensual /100;
    }
}
