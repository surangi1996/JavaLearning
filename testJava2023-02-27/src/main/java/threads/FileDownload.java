package threads;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownload {

    public static int i = 0;

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

//-----------Example One------------------------------------------------------------

        class myRunnable implements Runnable {

            @Override
            public void run() {
                int j ;
                while (true){
                    synchronized (links){
                        if (i >= links.length){
                            break;
                        }

                        j = i;
                        i++;
                    }
                    try {
                        downloadUrl(links[j], j);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }
        }

        Thread thread1 = new Thread(new myRunnable());
        Thread thread2 = new Thread(new myRunnable());

        thread1.start();
        thread2.start();

//--------------Example Two---------------------------------------------------------

//        Thread thread1 = new Thread(() -> {
//            int j ;
//            while (true){
//                synchronized (links){
//                    if (i >= links.length){
//                        break;
//                    }
//
//                    j = i;
//                    i++;
//                }
//                try {
//                    downloadUrl(links[j], j);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                int j ;
//                while (true){
//                    synchronized (links){
//                        if (i >= links.length){
//                            break;
//                        }
//
//                        j = i;
//                        i++;
//                    }
//                    try {
//                        downloadUrl(links[j], j);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();


//--------------Example Three---------------------------------------------------------

//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < links.length / 2; i++) {
//                    try {
//                        downloadUrl(links[i], i);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        });
//
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = links.length / 2; i < links.length; i++) {
//                    try {
//                        downloadUrl(links[i], i);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//            }
//        });
//
//        thread1.start();
//        thread2.start();


    }
}
