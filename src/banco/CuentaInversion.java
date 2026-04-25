package banco;

public class CuentaInversion extends CuentaBancaria {

    private double tasaAnual;
    private int plazoMeses;
    private double penalizacioRetiroAnticipado;

    //contructor con Super


    public CuentaInversion(String numeroCuenta, String titular,
                           double saldo, double tasaAnual,
                           int plazoMeses, double penalizacioRetiroAnticipado) {
        super(numeroCuenta, titular, saldo);
        this.tasaAnual = tasaAnual;
        this.plazoMeses = plazoMeses;
        this.penalizacioRetiroAnticipado = penalizacioRetiroAnticipado;
    }

    @Override
    public String describir() {
        return super.describir() + " --| Plazo: " + plazoMeses + "meses"+
                " | Tasa anual: " + tasaAnual + "%";
    }

    public double calcularComision() {
        return penalizacioRetiroAnticipado;
    }
    @Override
    public void realizarRetiro(double monto) {

        double total = monto + penalizacioRetiroAnticipado;

        if (total > getSaldo()) {
            System.out.println("no hay suficiente saldo");
            return;
        }

        setSaldo(getSaldo() - total);
    }

    //penalización por retirarse antes de tiempo

    public double calcularComision(int mesesTranscurridos) {
        if (mesesTranscurridos >= plazoMeses) {
            return 0.0;
        } else {
            return penalizacioRetiroAnticipado;
        }
    }

}
