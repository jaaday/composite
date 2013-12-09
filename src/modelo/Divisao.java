/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

public class Divisao extends Empresa {

    private String nomeDivisao;
    List<Empresa> divisoes = new ArrayList<Empresa>();

    public Divisao() {
    }

    public String getNomeChefe() {
        return nomeDivisao;
    }

    public void setNomeDivisao(String nomeDivisao) {
        this.nomeDivisao = nomeDivisao;
    }

    public String getNomeDivisao() {
        return nomeDivisao;
    }
    

    public void add(Empresa divisao) {
        divisoes.add(divisao);
    }

    public void accept(EmpresaVisitor v) {
        v.visit(this);
        for (Empresa emp : divisoes) {
            emp.accept(v);
        }
    }

    
    public String toString() {
        return "Divisao{" + "nomeDivisao=" + nomeDivisao + '}';
    }
}
