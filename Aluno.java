public class Aluno extends Pessoa implements Voluntario, Atleta {
    private int matricula;

    public Aluno(int matricula, String cpf, String nome, int idade) {
        super(cpf, nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String getNomeVoluntario() {
        return getNome();
    }

    @Override
    public int getCodigo() {
        return 10;
    }

    @Override
    public int getHorasDisponiveis() {
        return 8;
    }

    @Override
    public int getModalidade() {
        return 1;
    }

    @Override
    public String getNomeAtleta() {
        return getNome();
    }

    @Override
    public String toString() {
        return super.toString() + " [matricula=" + matricula + "]";
    }
    
}
