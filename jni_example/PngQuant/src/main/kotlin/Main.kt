import org.pngquant.Image
import org.pngquant.PngQuant
import java.io.File
import javax.imageio.ImageIO

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val originFile = File("1.png")
        val img = ImageIO.read(originFile)
        val nImg = Image(img)
        val bImg = PngQuant().quantize(nImg).getRemapped(nImg)
        ImageIO.write(bImg, "png", File("1_quantize.png"))
    }
}