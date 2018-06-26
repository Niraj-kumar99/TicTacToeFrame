import javax.swing.JFrame ;
public class testframe 
{
    JFrame obj;
    
    public testframe ()
    {
      obj=new JFrame();
      obj.setTitle("TEST FRAME");
      obj.setVisible(true);
      obj.setSize(700,600);
    }
    public static void main(String[] args)
    {
        testframe hobj= new testframe();
    }
    
}
