/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

public class Maquinas extends Empresa
{
    private String nome;
    private double custo;
    
    public Maquinas(){
       
    }
    public void accept(EmpresaVisitor visitor){
        visitor.visit(this);
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
        return "Maquinas{" + "nome=" + nome + ", custo=" + custo + '}';
    }       
}
