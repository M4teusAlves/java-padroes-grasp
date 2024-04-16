package interfaces;

public interface Planta {
    String getNome();
    double getPreco();
    String getTipo(); 
    String getDescricao();
    int getQuantidadeEstoque(); 
    void setQuantidadeEstoque(int quantidade);
}

