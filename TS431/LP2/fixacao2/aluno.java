package fixacao2;

public class aluno {
    int matricula;
    String nome;
    float nota1;
    float nota2;
    float nota3;
    int faltas;

    public void setmatricula(int m) {
        matricula = m;
    }

    public int getmatricula() {
        return matricula;
    }

    public void setnome(String n) {
        nome = n;
    }

    public String getnome() {
        return nome;
    }

    public void setnota1(float n1) {
        nota1 = n1;
    }

    public float getnota1() {
        return nota1;
    }

    public void setnota2(float n2) {
        nota2 = n2;
    }

    public float getnota2() {
        return nota2;
    }

    public void setnota3(float n3) {
        nota3 = n3;
    }

    public float getnota3() {
        return nota3;
    }

    public void setfaltas(int f) {
        faltas = f;
    }

    public int getfaltas() {
        return faltas;
    }

}
