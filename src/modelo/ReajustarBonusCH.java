/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


public class ReajustarBonusCH extends EmpresaVisitor
{
   double custo = 0;
   
   public ReajustarBonusCH(double custo)
   {
       this.custo = custo;
   }
   
   public void visit(Divisao d){
   }
   
   public void visit(RecursosHumanos rh){
   }
   
   public void visit(Maquinas m){
   }
   
   public void visit(Chefe c){
       double resultado = custo*c.getBonus();
       c.setBonus(resultado);
   }
   
   public double getResultado(){
       return custo;
   }
}

