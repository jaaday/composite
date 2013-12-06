/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.*;

public class RecursosHumanos extends Empresa
{
    private String nomeRH;
    private double custoRH;
    ArrayList<Empresa> rhs = new ArrayList<Empresa>();
    
    public RecursosHumanos(){
        
    }
    
    public void add(Empresa chefe){
        rhs.add(chefe);
    }
    
    public void accept(EmpresaVisitor visitor){
        visitor.visit(this);
        for(Empresa emp: rhs){
            emp.accept(visitor);
        }
    }

    public String getNomeChefe() {
        return nomeRH;
    }

    public void setNomeRH(String nomeRH) {
        this.nomeRH = nomeRH;
    }

    public double getCustoRH() {
        return custoRH;
    }

    public void setCustoRH(double custoRH) {
        this.custoRH = custoRH;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "nomeRH=" + nomeRH + ", custoRH=" + custoRH + '}';
    }  
}

