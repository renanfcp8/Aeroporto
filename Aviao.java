import java.util.ArrayList;
import java.util.List;


public class Aviao {
    private String modelo;
    private String fabricante;
    private int capacidade;
    private List<Passageiro> passageiros = new ArrayList<>();
    
    public Aviao(String modelo, String fabricante, int capacidade){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidade = capacidade;
    }

    public String getModelo(){
        return modelo;
    }
    public String getFabricante(){
        return fabricante;
    }
    public int getCapacidade(){
        return capacidade;
    }

    public void setDados(String modelo, String fabricante, int capacidade){
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidade = capacidade;
    }

    public boolean adicionarPassageiro(Passageiro passageiro){
        if(passageiros.size() < capacidade){
            passageiros.add(passageiro);
            return true;
            } else {
                return false;
            }

        }
    


}
