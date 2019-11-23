
public class Material {

private String nome;
private int quantidade;

public Material (String n, int q)throws QuantidadeInvalidaException{
    this.setNome (n);
    this.setQuantidade (q);
}

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public final void setQuantidade(int q) 
            throws QuantidadeInvalidaException{
        
        if(q <0){
            
            throw new QuantidadeInvalidaException ("Quantidade menor que zero");
        }
    
        
        this.quantidade = q;
    }



}
