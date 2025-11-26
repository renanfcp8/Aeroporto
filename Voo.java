import java.util.List;
import java.util.ArrayList;


public class Voo implements Comparable<Voo>{
    private String codigo;
    private String origem;
    private String destino;
    private String dataHora;
    private Aviao aviao;
    private final List<Passageiro> passageiro = new ArrayList<>();

    public Voo(String codigo, String origem, String destino, String dataHora, Aviao aviao){
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
        this.aviao = aviao;
    }

    public String getCodigo(){
        return codigo;
    }
    public String getOrigem(){
        return origem;
    }
    public String getDestino(){
        return destino;
    }
    public String getDataHora(){
        return dataHora;
    }
    public Aviao getAviao(){
        return aviao;
    }

    public void setDados(String codigo, String origem, String destino, String dataHora, Aviao aviao){
        this.codigo = codigo;
        this.origem = origem;
        this.destino = destino;
        this.dataHora = dataHora;
        this.aviao = aviao;
    }


    public boolean adicionarPassageiro(Passageiro p){
        if(aviao.adicionarPassageiro(p)){
            this.passageiro.add(p);
            return true;
            } else {
                return false;
            }
        }
    @Override
    public int compareTo(Voo outroVoo){
        return this.dataHora.compareTo(outroVoo.getDataHora());
    }

}
