//Nome: Renan Gonçalves Pereira
// Não to conseguindo grava com audio por conta do pc a entrada do fone não ta pegando e não tem o bluetooth
//e o video deu poblema mas com essa primeira class por eu to gravando hoje
//A outra parte ta com Kevin
//Desculpa por não tem o audio esse pc não e meu o meu notebook ta com defeito na placa mãe



public class Pessoa {
    private String nome;
    private String cpf;
    private String email;

    public Pessoa(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + ", Cpf: " + cpf + ", Email: " + email;
    }

    public void setDados(String nome, String cpf, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

}
