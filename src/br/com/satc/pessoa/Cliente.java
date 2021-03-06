
package br.com.satc.pessoa;


public class Cliente extends Pessoa {
    private String logradouro;
    private Double renda;
    
    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setRenda(renda);
        this.setLogradouro(logradouro);
            
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }


    @Override
    public String retornaDados() {
        
     String dados = "Nome: " + this.getNome()
       +"\nRG " + this.getRg() 
       +"\nCPF " + this.getCpf()
       +"\nRenda " + this.getRenda()
       +"\nLogradouro " + this.getLogradouro();
     
     return dados;
    }

    @Override
    public void AlteraNome(String novoNome) {
        this.setNome(novoNome);
    }
    
}
