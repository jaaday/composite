/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

import java.util.*;

public class RecursosHumanos extends Empresa
{
    private String nome;
    private double custo;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    @Override
    public String toString() {
        return "RecursosHumanos{" + "nome=" + nome + ", custo=" + custo + '}';
    }  
}

