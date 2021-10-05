public abstract class Funcionario extends Pessoa {
    private int matricula;
    private double salario;

    public Funcionario(int matricula, String cpf, String nome, int idade, double salario) {
        super(cpf, nome, idade);
        this.matricula = matricula;
        this.salario = salario;
    }

    public abstract double getBonus();

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return super.toString() + " [matricula=" + matricula + ", salario=" + getSalario() + ", bonus=" + getBonus() + "]";
    }
}
