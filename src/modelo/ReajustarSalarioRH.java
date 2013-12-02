/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

public class ReajustarSalarioRH extends EmpresaVisitor
{
   double custo = 0;
   
   public ReajustarSalarioRH(double custo)
   {
       this.custo = custo;
   }
   
   public void visit(Divisao d){
   }
   
   public void visit(RecursosHumanos rh){
       double resultado = custo*rh.getPreco();
       rh.setCusto(resultado);
   }
   
   public void visit(Maquinas m){
   }
   
   public void visit(Chefe c){
   }
   
   public double getResultado(){
       return custo;
   }
}
