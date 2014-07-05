import comp102x.ColorImage;
import comp102x.Canvas;

public class Lab03
{  
    
    public void loadAnImage() 
    {
        // Please write your code after this line
        ColorImage image = new ColorImage();
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
    }
    
    public void loadTwoImagesOnTheSameCanvas()
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        int x = image1.getWidth()*2;
        int y = image1.getHeight();
        Canvas canvas = new Canvas(x, y);
        canvas.add(image1);
        canvas.add(image2, y, 0);
        
    }
    
    public void imageAddition() 
    {    
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.add(image1,image2);
        int x = image1.getWidth()*3;
        int y = image1.getHeight();
        Canvas canvas = new Canvas(x+20, y);
        canvas.add(image1);
        canvas.add(image2, y+10, 0);
        canvas.add(image3, y*2+20, 0);
        
        
        
    }
   
    public void imageMultiplication() 
    {
        // Please write your code after this line
        ColorImage image1 = new ColorImage();
        ColorImage image2 = new ColorImage();
        ColorImage image3 = ColorImage.multiply(image1,image2);
        int x = image1.getWidth()*3;
        int y = image1.getHeight();
        Canvas canvas = new Canvas(x+20, y);
        canvas.add(image1);
        canvas.add(image2, y+10, 0);
        canvas.add(image3, y*2+20, 0);
        
        
        
    }
    
    public void changeColor()
    {
        ColorImage image = new ColorImage();
        image.increaseRed(40);
        Canvas canvas = new Canvas(image.getWidth(), image.getHeight());
        canvas.add(image);
        
        //image.save();
    }
}
