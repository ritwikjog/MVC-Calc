import java.net.*;
import java.awt.*;

public class HTMLView {

    public void loadPage(){
        try{
            String url = "file:///C:/Users/Ritwik%20Jog/Desktop/College/SADP/htmlView.html";
            URI oUri = new URI(url);
            Desktop.getDesktop().browse(oUri);
        }
        catch(Exception e){
            System.out.println("Error");
        }
    }
}