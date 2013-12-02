/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.*;

public class Divisao extends Empresa {

    private String nome;
    List<Empresa> divisoes = new ArrayList<Empresa>();

    public Divisao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        return "Divisao{" + "nome=" + nome + '}';
    }
}
