
package modelo;


import java.util.*;

public class IteratorVisitor extends EmpresaVisitor
{
    private ArrayList<Empresa> resultado = new ArrayList<Empresa>();
    
    public void visit(Divisao d){
        resultado.add(d);
    }
    
    public void visit(RecursosHumanos rh){
        resultado.add(rh);
    }
    
    public void visit(Maquinas ma){
        resultado.add(ma);
    }
    
     public void visit(Chefe ch){
        resultado.add(ch);
    }
    
    public Iterator<Empresa> getIterator(){
        return resultado.iterator();
    }
    
}