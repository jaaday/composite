package modelo;

public class Chefe extends Empresa
{
    private String nomeChefe;
    private double custoChefe;
    private double bonusChefe = 0;
    
    public Chefe(){
     
    }
    
    public void accept(EmpresaVisitor visitor){
        visitor.visit(this);
    }

    public String getNomeChefe() {
        return nomeChefe;
    }

    public void setNomeChefe(String nomeChefe) {
        this.nomeChefe = nomeChefe;
    }

    public double getCustoChefe() {
        return custoChefe;
    }

    public void setCustoChefe(double custoChefe) {
        this.custoChefe = custoChefe;
    }

    public void setBonusChefe(double bonusChefe) {
        this.bonusChefe = bonusChefe;
    }

    @Override
    public String toString() {
        return "Chefe{" + "nomeChefe=" + nomeChefe + ", custoChefe=" + custoChefe + ", bonusChefe=" + bonusChefe + '}';
    }          
}
