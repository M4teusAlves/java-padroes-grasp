package model;

public class Video extends Media {
    private Integer velocidadeReproducao;

    public Video(String nome, Integer velocidadeReproducao) {
        super(nome);
        this.velocidadeReproducao = velocidadeReproducao;
    }

    public Integer getVelocidadeReproducao() {
        return velocidadeReproducao;
    }

    public void setVelocidadeReproducao(Integer velocidadeReproducao) {
        this.velocidadeReproducao = velocidadeReproducao;
    }

    @Override
    public void reproduzir(){
        System.out.println("----------------------------\n"
                        +  "|                           |\n"
                        +  "|                           |\n"
                        +  "|          video            |\n"
                        +  "|                           |\n"
                        +  "-----------------------------\n"
                        + this.getNome() + "      " + this.velocidadeReproducao + "x"
                        +  "\n|| ---------------------- 2:00");

    }

    public void mudarVelocidade(){
        this.velocidadeReproducao++;
    }

    public void mudarVelocidade( Integer velocidade ){
        this.velocidadeReproducao = velocidade;
    }

}
