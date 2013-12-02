package modelo;

public class Chefe extends Empresa
{
    private String nome;
    private double custo;
    private double bonus = 0;
    
    public Chefe(){
     
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

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Chefe{" + "nome=" + nome + ", custo=" + custo + ", bonus=" + bonus + '}';
    }          
}
