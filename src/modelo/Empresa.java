/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;


public abstract class Empresa
{
    public void add(Empresa empresa){
        throw new UnsupportedOperationException();
    }
    
    public String getNome(){
        throw new UnsupportedOperationException();
    }
    
    public void accept(EmpresaVisitor visitor){
    }
    
    
    public double getBonus(){
        throw new UnsupportedOperationException();
    }
     /*
    public void remove (MenuComponent menuComponent){
        throw new UnsupportedOperationException();
    }
    
   
    
    public MenuComponent getChild(int i){
        throw new UnsupportedOperationException();
    }
    **/
    public double getPreco(){
        throw new UnsupportedOperationException();
    }
    
}

