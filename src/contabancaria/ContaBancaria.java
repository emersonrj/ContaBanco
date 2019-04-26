package contabancaria;
public class ContaBancaria {
    public static void main(String[] args) {
       ContaBanco p1 = new ContaBanco();
       p1.setNumConta(1111);
       p1.setDono("Vanessa");
       p1.abrirConta("CC");
       p1.depositar(500);
       p1.sacar(100);
       p1.estadoAtual();
       
       
       ContaBanco p2 = new ContaBanco();
       p2.setNumConta(2222);
       p2.setDono("Daniel");
       p2.abrirConta("CP");
       p2.depositar(250);
       p2.pagarMensal();
       p2.estadoAtual();
      
    }
    
}
