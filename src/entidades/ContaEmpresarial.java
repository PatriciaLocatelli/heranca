package entidades;

public class ContaEmpresarial extends Conta {

    private Double carregaLimite;

    public ContaEmpresarial() {
        super();
    }

    public ContaEmpresarial(Integer numero, String titular, Double saldo, Double carregaLimite) {
        super(numero, titular, saldo);
        this.carregaLimite = carregaLimite;
    }

    public Double getCarregaLimite() {
        return carregaLimite;
    }

    public void setCarregaLimite(Double carregaLimite) {
        this.carregaLimite = carregaLimite;
    }

    public void emprestarDinheiro(double saldoConta) {
        if (saldoConta <= carregaLimite) {
            deposito(saldoConta);
            saldo += saldoConta - 10.0;
        }
    }
}
