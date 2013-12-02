/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


public class CustoTotal extends EmpresaVisitor
{
   private double resultado = 0;
   
   public void visit(RecursosHumanos rh){
       double custo = rh.getPreco();
       resultado += custo;
   }
   
   public void visit(Maquinas ma){
       double custo = ma.getPreco();
       resultado += custo;
   }
   
   public void visit(Chefe ch){
       double custo = ch.getPreco()+ ch.getBonus();
       resultado += custo;
   }
   
   public double getResultado(){
       return resultado;
   }
}

