package MODEL;

import java.util.Calendar;


public class Cliente {
    
    private String nome, sexo, dataNascimento;
    private int cpf;
    
    public Cliente(){
        
    }
    
    public Cliente(String nome, String sexo, int cpf, String dataNascimento){
        
        this.setNome(nome);
        this.setSexo(sexo);
        this.setCpf(cpf);
        this.setDataNascimento(dataNascimento);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        
        this.dataNascimento = dataNascimento;
        
    }
    
    
    
}
