// Do you need a Portfolio object to simulate
// the photography shop?
// Write a class Portfolio if you need a portfolio
// to implement your design.
import java.util.ArrayList;
public class Portfolio

{
    public String photoFile;
    public String photogName;
    public Portfolio(String photoFile, String photogName)
    {
        this.photoFile = photoFile;
        this.photogName =photogName;
       
    }
    
        public void setPhotogName(String photogName)
    {
        this.photogName = photogName;
    }
    
        public String getPhotogName()
    {
        return photogName;
    }
    
            public void setPhotoFile(String photoFile)
    {
        this.photoFile = photoFile;
    }
    
        public String getPhotoFile()
    {
        return photoFile;
    }
}
