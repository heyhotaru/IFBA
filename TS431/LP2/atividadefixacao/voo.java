package atividadefixacao;

public class voo{
    String Numero;
    int Capacidade;
    String Origem;
    String Destino;
    boolean NoHorario;

    public void setNumero(String n){
        Numero = n;
    }
        public String getNumero(){
            return Numero;
        }

    public void setCapacidade(int c){
        Capacidade = c;
    }
        public int getCapacidade(){
            return Capacidade;
        }

    public void setOrigem(String o){
        Origem = o;
    }
        public String getOrigem(){
            return Origem;
        }

    public void setDestino(String d){
        Destino = d;
    }
        public String getDestino(){
            return Destino;
        }

    public void setNoHorario(boolean h){
        NoHorario = h;
    }
        public boolean getHorario(){
            return NoHorario;
        }

}
