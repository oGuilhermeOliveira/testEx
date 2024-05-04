package br.com.guilhermeoli.testes;

import java.util.List;

/**
 * @author guiol
 */
public class PessoaTest {

    private String id;

    private String nome;

    private String sexo;

    private int idade;


    public PessoaTest(String id, String nome, String sexo, int idade) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public PessoaTest() {

    }

    public PessoaTest(PessoaTest pessoa) {
        this(pessoa.getId(), pessoa.getNome(), pessoa.getSexo(), pessoa.getIdade());
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<PessoaTest> populaPessoas() {
        PessoaTest pessoa1 = new PessoaTest("p1", "Matheus Henrique", "Masculino", 38);
        PessoaTest pessoa2 = new PessoaTest("p2", "Hernandez Roja", "Masculino", 21);
        PessoaTest pessoa3 = new PessoaTest("p3", "Sofia", "Feminino", 22);
        PessoaTest pessoa4 = new PessoaTest("p4", "Neymar Junior", "Masculino", 22);
        PessoaTest pessoa5 = new PessoaTest("p5", "Marta Santos", "Feminino", 22);
        return List.of(pessoa1, pessoa2, pessoa3, pessoa4, pessoa5);
    }

    @Override
    public String toString() {
        return "PessoaTest{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", idade=" + idade +
                '}';
    }
}