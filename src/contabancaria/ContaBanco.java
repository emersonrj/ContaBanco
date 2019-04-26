package contabancaria;

import java.awt.BorderLayout;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private float saldoAnt;
    private boolean status;
    
    //Métodos especiais
    
    public void estadoAtual(){
        System.out.println("----------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Nome: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Saldo ant: "+this.getSaldoAnt());
        System.out.println("Status: "+this.getStatus());
    }

    public ContaBanco() { //Contrutor
        
    }
    
    public void abrirConta(String t){
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta de "+this.getDono()+" aberta com sucesso!");
        
    }
    public void fecharConta(){
        if (this.getStatus()) {
            if (this.getSaldo()>0) {
                System.out.println("OPERAÇÃO NEGADA!! Conta com saldo");
            }else if (this.getSaldo()<0) {
                System.out.println("OPERAÇÃO NEGADA!! Saldo negativo");
            }
        }else{
            System.out.println("Conta de "+this.getDono()+" fechada com sucesso!");
        }
    }
   
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()+v);
            this.setSaldoAnt(this.getSaldo()-v);
            System. out.println("Depósito de "+v+" realizado com sucesso na conta de "+this.getDono());
        } else {
            System.out.println("ATENÇÃO! Conta não existe!");
        }
    } 
    
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>= v) {
                this.setSaldo(this.getSaldo()-v);
                this.setSaldoAnt(this.getSaldo()+v);
                System.out.println("Saque de "+v+" realizado co sucesso na conta de " +this.getDono());
            }else{
                System.out.println("Saldo na conta da "+this.getDono()+ "insuficiente");
            }
        } else {
            System.out.println("ATENÇÃO! Conta não existe!");
        }
    }
    
    public void pagarMensal(){
        int v=0;
        if ("CC".equals(this.getTipo())) {
            v=12;
        } else if ("CP".equals(this.getTipo())) {
            v=20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Mensalidade da conta de "+this.getDono()+ "paga com sucesso!");
        } else {
            System.out.println("Conta não existe!");
        }

    }
    
    //Método acessores

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoAnt() {
        return saldoAnt;
    }

    public void setSaldoAnt(float saldoAnt) {
        this.saldoAnt = saldoAnt;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
}
