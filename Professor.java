public class Professor extends Funcionario implements Voluntario, Atleta{
    private String formacao;
    private int modalidade;

    public Professor(int matricula, String cpf, String nome, int idade, double salario, String formacao, int modalidade) {
        super(matricula, cpf, nome, idade, salario);
        this.formacao = formacao;
        this.modalidade = modalidade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public double getBonus() {
        return 1000;
    }

    @Override
    public String getNomeVoluntario() {
        return getNome();
    }

    @Override
    public int getCodigo() {
        return 11;
    }

    @Override
    public int getHorasDisponiveis() {
        return 2;
    }

    @Override
    public int getModalidade() {
        return modalidade;
    }

    @Override
    public String getNomeAtleta() {
        return getNome();
    }

    @Override
    public String toString() {
        return super.toString() + " [formacao=" + formacao + "]";
    }
}
