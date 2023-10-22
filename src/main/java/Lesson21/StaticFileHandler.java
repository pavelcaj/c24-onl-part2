package Lesson21;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StaticFileHandler implements HttpHandler {

    private static final String STATIC_FOLDER_PATH = "D:\\c24-onl\\src\\main\\java\\lesson21\\staticRes\\index.html";

    @Override
    public void handle(HttpExchange exchange) throws IOException {
      String path = exchange.getRequestURI().getPath();
      String filename = "src/main/java/lesson21/staticRes" + path;
      File file = new File(filename);
      if (file.exists()){
          Headers headers = exchange.getResponseHeaders();
          headers.set("Content-Type","text/html");
          exchange.sendResponseHeaders(200, file.length());
            try (OutputStream os = exchange.getResponseBody();
                 FileInputStream fis = new FileInputStream(file)){
                int count;
                byte[]buffer = new byte[1024];
                while((count = fis.read(buffer))!=-1){
                    os.write(buffer,0,count);
                }
            }
      }else{
          String reasponse = "File not found";
          exchange.sendResponseHeaders(404,reasponse.length());
          try(OutputStream os = exchange.getResponseBody()){
              os.write(reasponse.getBytes());
          }
      }






       // String requestedPath = exchange.getRequestURI().getPath();
        //Path filePath = Paths.get(STATIC_FOLDER_PATH, requestedPath.substring(1));

//        if (Files.exists(filePath) && Files.isRegularFile(filePath)) {
  //          byte[] fileBytes = Files.readAllBytes(filePath);
    //        exchange.sendResponseHeaders(200, fileBytes.length);
      //      OutputStream outputStream = exchange.getResponseBody();
        //    outputStream.write(fileBytes);
          //  outputStream.close();
        //} else {
          //  String response = "File not found.";
           // exchange.sendResponseHeaders(404, response.length());
            //OutputStream outputStream = exchange.getResponseBody();
            //outputStream.write(response.getBytes());
            //outputStream.close();
        //}
    }
}