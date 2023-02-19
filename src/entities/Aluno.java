package entities;

public class Aluno {
    private String nome;
    private Integer id;
    private Double n1, n2, n3;

    public Aluno() {

    }

    public Aluno(String nome, Integer id, Double n1, Double n2, Double n3) {
        this.nome = nome;
        this.id = id;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", id=" + id + ", n1=" + n1 + ", n2=" + n2 + ", n3=" + n3 + "]";
    }

}
