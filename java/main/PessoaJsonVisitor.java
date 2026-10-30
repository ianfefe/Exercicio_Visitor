public class PessoaJsonVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirAluno(Aluno aluno) {
        return JSON.parse("Aluno{" +
                "matricula=" + aluno.getMatricula() +
                ", nome='" + aluno.getNome() + '\'' +
                ", curso=" + aluno.getNomeCurso() +
                '}');
    }

    @Override
    public String exibirProfessor(Professor professor) {
        return JSON.parse("Professor{" +
                "matricula=" + professor.getMatricula() +
                ", nome='" + professor.getNome() + '\'' +
                ", titulacao='" + professor.getTitulacao() + '\'' +
                '}');
    }

    @Override
    public String exibirFuncionario(Funcionario funcionario) {
        return JSON.parse("Funcionario{" +
                "codigo=" + funcionario.getCodigo() +
                ", nome='" + funcionario.getNome() + '\'' +
                ", salario=" + funcionario.getSalario() +
                '}');
    }
}
