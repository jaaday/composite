

package modelo;

public class Relatorio extends EmpresaVisitor
{
   private String resultado = "";
   private double rhs = 0;
   private double mas = 0;
   private double chs = 0;
   
   public void visit(Divisao divisao){
       if(resultado.equals("")){
          resultado = divisao.getNome()+ "\n";
       }
   }
   
   public void visit(RecursosHumanos rh){
       double custo = rh.getPreco();
       rhs += custo;
   }
   
   public void visit(Maquinas ma){
       double custo = ma.getPreco();     
       mas += custo;
   }
   
   public void visit(Chefe ch){
       double custo = ch.getPreco() + ch.getBonus();
       chs += custo;
   }

    @Override
    public String toString() {
        return "Relatorio{" + "resultado=" + resultado + ", rhs=" + rhs + ", mas=" + mas + ", chs=" + chs + '}';
    }
}

