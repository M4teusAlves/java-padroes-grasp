import java.util.ArrayList;

import model.Galeria;
import model.Imagem;
import model.Media;
import model.Video;

public class App {
    public static void main(String[] args) throws Exception {

        Galeria galeria = new Galeria();

        galeria.setMedias(new ArrayList<>());

        galeria.getMedias().add(new Imagem("1.jpeg", "1900:700px"));
        galeria.getMedias().add(new Imagem("2.jpeg", "1900:700px"));
        galeria.getMedias().add(new Imagem("3.jpeg", "1900:700px"));
        galeria.getMedias().add(new Video("aniversario.mp4", 2));
        galeria.getMedias().add(new Video("casamento.mp4", 3));
        galeria.getMedias().add(new Video("formatura.mp4",1));

        for (Media media : galeria.getMedias()) {
            media.reproduzir();
        }

        Video video = new Video("teste.mp4", 1);

        video.reproduzir();

        video.mudarVelocidade();

        video.reproduzir();

        video.mudarVelocidade(7);

        video.reproduzir();
    }

}
