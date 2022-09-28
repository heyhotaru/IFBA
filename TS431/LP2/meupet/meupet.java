public class meupet{
    String especie;
    String nome;
    String raca; 
    char sexo;
    int idade;
    float peso;

    public void setNome(String n){
    nome = n;
}
public String getNome(){
    return nome;
}

public void setEspecie(String e){
    especie = e;
}

public String getEspecie(){
    return especie;
}

public void setRaca(String r){
    raca = r;
}
public String getRaca(){
    return raca;
} 

public void setSexo(char s){
    sexo = s;
}
public char getSexo(){
    return sexo;
}

public void setIdade(int i){
    idade = i;
}
public int getIdade(){
    return idade;
}

public void setPeso(float p){
    peso = p;
}
public float getPeso(){
    return peso;
}
}