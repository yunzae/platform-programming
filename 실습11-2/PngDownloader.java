import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PngDownloader {


    public static Path get(String url) {
        Path path = null;
        try {
            InputStream is = null;
            URL imgurl = new URL(url);
            FileOutputStream fos = new FileOutputStream("3");
            URLConnection urlConnection = imgurl.openConnection();
            is = urlConnection.getInputStream();
            byte[] buffer = new byte[1024];
            int readBytes;

            while ((readBytes = is.read(buffer)) != -1) {

                fos.write(buffer, 0, readBytes);
            }
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
        path=Paths.get("3");

        return path;
    }}


