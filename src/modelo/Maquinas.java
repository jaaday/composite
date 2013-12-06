/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;

public class Maquinas extends Empresa
{
    private String nomeMaquina;
    private double custoMaquina;
    
    public Maquinas(){
       
    }
    public void accept(EmpresaVisitor visitor){
        visitor.visit(this);
    }

    public String getNomeChefe() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        this.nomeMaquina = nomeMaquina;
    }

    public double getCustoMaquina() {
        return custoMaquina;
    }

    public void setCustoMaquina(double custoMaquina) {
        this.custoMaquina = custoMaquina;
    }

    @Override
    public String toString() {
        return "Maquinas{" + "nomeMaquina=" + nomeMaquina + ", custoMaquina=" + custoMaquina + '}';
    }       
}
