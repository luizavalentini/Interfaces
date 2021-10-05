public class TecnicoAdministrativo extends Funcionario {
    private int cargo;

    public TecnicoAdministrativo(int matricula, String cpf, String nome, int idade, double salario, int cargo) {
        super(matricula, cpf, nome, idade, salario);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    @Override
    public double getSalario() {
        switch(cargo) {
            case 1:
                return super.getSalario();
            case 2:
                return super.getSalario() * 1.15;
            case 3:
                return super.getSalario() * 1.25;
            default:
                return super.getSalario();
        }
    }

    @Override
    public double getBonus() {
        return getSalario() * 0.10; 
    }

    @Override
    public String toString() {
        return super.toString() + " [cargo=" + cargo + "]";
    }

    
}

