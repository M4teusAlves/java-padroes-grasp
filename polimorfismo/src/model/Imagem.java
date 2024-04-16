package model;

public class Imagem extends Media{
    private String resolucao;

    public Imagem(String nome, String resolucao) {
        super(nome);
        this.resolucao = resolucao;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    @Override
    public void reproduzir(){

        System.out.println("----------------------------\n"
                        +  "|               /.    |     |\n"
                        +  "|   /.   /.    /  .    |....|\n"
                        +  "|  /  . /  .  /    .        |\n"
                        +  "| /    .    ./      .       |\n"
                        +  "-----------------------------\n"
                        + this.getNome() + "      " + this.resolucao);
    }

    
    
}
