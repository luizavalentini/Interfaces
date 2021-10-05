import java.util.ArrayList;
import java.util.List;

// Quantos tipos eu tenho nessa aplicação?
// Pessoa, Aluno, Funcionario, Professor, TecnicoAdministrativo, Voluntario, Atleta

// Quais dos tipos eu posso instanciar?
// Aluno, Professor, TecnicoAdministrativo

// Quais são tipos abstratos com implementação?
// Pessoa, Funcionario

// Quais são interfaces?
// Voluntario, Atleta

public class App {
    
    public static void imprimePessoa(Pessoa p) {
        System.out.println(p.getNome() + " tem CPF " + p.getCpf());
    }

    public static void imprimeVoluntarios(List<Voluntario> lista) {
        for (Voluntario v: lista) {
            System.out.println(v.getNomeVoluntario());
        }
    }

    public static void imprimeAtleta(Atleta a) {
        System.out.println(a.getNomeAtleta() + ", modalidade=" + a.getModalidade());
    }


    public static void main(String args[]) {
        List<Voluntario> lista = new ArrayList<Voluntario>();
        
        Pessoa a = new Aluno(100, "000.000.001-00", "Maria", 23);
        lista.add((Aluno)a);
        System.out.println(a);

        Professor p = new Professor(300, "000.000.003-00", "Pedro", 30, 5000, "Doutorado", 2);
        System.out.println(p.toString());
        lista.add(p);
        imprimeAtleta(p);

        TecnicoAdministrativo ta = new TecnicoAdministrativo(400, "000.000.004-00", "Davi", 25, 8000, 2);
        //ta.setCargo(3);
        System.out.println(ta.toString());

        // imprimePessoa(a);
        // imprimePessoa(f);
        // imprimeVoluntarios(lista);
    }
}
