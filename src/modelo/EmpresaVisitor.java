/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;



public abstract class EmpresaVisitor{

    public void visit(Divisao divisao){}
    public void visit(RecursosHumanos rh){}
    public void visit(Maquinas ma){}
    public void visit(Chefe ch){}
}
