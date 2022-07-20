import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;

public class StickerMaker {
    public static void createNewImage() throws Exception{
    // Ler uma imagem
        BufferedImage original = ImageIO.read(new File("src/resources/static/fotos/stranger-things-4.jpg"));
    // Nova imagem em memória com transparência (identificar altura e largura)
        Integer largura = original.getWidth();
        Integer altura = original.getHeight();
        Integer novaAltura = altura + 200;
        BufferedImage imagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);
    // copiar imagem original para nova imagem na memória
        Graphics2D graphics = (Graphics2D) imagem.getGraphics();
        graphics.drawImage(original, 0, 0, null);
    // escrever uma frase na foto
        graphics.drawString("Mãe assitindo", 100, altura - 100);
    // escrever a nova imagem em um arquivo
        ImageIO.write(imagem, "png", new File("src/resources/static/figurinhas/stranger-things-4-fig.png"));
    }
// testar
    public static void main(String[] args) throws Exception{
        StickerMaker.createNewImage();
    }

}
