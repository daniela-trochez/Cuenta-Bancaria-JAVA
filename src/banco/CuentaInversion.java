package banco;

public class CuentaInversion extends  CuentaBancaria {

    private double tasaAnual;
    private  int plazoMeses;
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
        return super.describir() +" | Plazo: "+ plazoMeses +
                "Tasa anual: "+tasaAnual+"%";
    }

    public double calcularComision(){
        return penalizacioRetiroAnticipado;
    }

    public void realizarRetiro(double monto){

        double total = monto + penalizacioRetiroAnticipado;
        setSaldo(getSaldo()-total);

    }

     //calcularComision(int mesesTranscurridos){

}
