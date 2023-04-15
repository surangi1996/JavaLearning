package threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPoolDownload {

    public static ReentrantLock lock = new ReentrantLock();

    static String[] links = {
            "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/archery-tournament-flyer-design-template-d97b83ecf3bc1c6f73fedd3d38a83a3d.jpg?ts=1636983043",
            "https://d1csarkz8obe9u.cloudfront.net/posterpreviews/archery-tournament-flyer-design-template-78f0a9b8938a9be93a51a1cbe5ea95ff_screen.jpg?ts=1636992141",
            "https://i.pinimg.com/originals/4c/a0/cf/4ca0cffc451d5522919fb7332c91e3d3.jpg"
    };

    public static void downloadUrl(String url, int index) throws IOException {
        URL website = new URL(url);
//            String fileName = website.getFile().substring(website.getFile().lastIndexOf('/') + 1).split("\\?")[0];
        String fileName = "" + index + ".jpg";
        Path filePath = Paths.get("downloads", fileName);
        InputStream in = website.openStream();
        Files.copy(in, filePath);
        System.out.println("File downloaded successfully: " + filePath);
    }

    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(5);

        for (int i = 0; i < links.length; i++) {
            int finalI = i;
            service.submit(() -> {
                    try {
                        downloadUrl(links[finalI], finalI);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
            });
        }

        service.shutdown();

        try {
            service.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
