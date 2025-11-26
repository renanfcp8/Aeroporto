public class Passageiro extends Pessoa{
    private String assento;
    private String numeroPassagem;
    private boolean possuiBagagem;

    public Passageiro(String nome, String cpf, String email, String assento, String  numeroPassagem, boolean possuiBagagem){
        super(nome, cpf, email);
        this.assento = assento;
        this.numeroPassagem = numeroPassagem;
        this.possuiBagagem = possuiBagagem;
    }

    public String getAssento(){
        return assento;
    }
    public String getNumeroPassagem(){
        return numeroPassagem;
    }
    public boolean isPossuiBagagem(){
        return possuiBagagem;
    }


    //Vou fazer o setDados que ta me sugerindo por esse ta melhor que o meu
    public void setDados(String nome, String cpf, String email, String assento, String numeroPassagem, boolean possuiBagagem){
        super.setDados(nome, cpf, email);
        this.assento = assento;
        this.numeroPassagem = numeroPassagem;
        this.possuiBagagem = possuiBagagem;
    }

    @Override
    public String toString(){
        return super.toString() + ", Assento: " + assento + ", Numero da Passagem: " + numeroPassagem + ", Possui Bagagem: " + possuiBagagem;
    }
    
}
