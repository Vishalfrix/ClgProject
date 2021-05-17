package p1;
public class booksearch {
    
    private int bookID;
    private String name;
    private String publisher;
    private int price;
    
    public  booksearch(int ID,String Bname,String Bpublisher,int cost)
    {
        this.bookID=ID;
        this.name=Bname;
        this.publisher=Bpublisher;
        this.price=cost;
    }
    
    public int getID()
        {
             return bookID;
        }
    
    public String getBname()
        {
             return name;
        }
    
    public String getBpublisher()
         {
             return publisher;
         }
    
    public int getcost()
            {
               return price;
            }
}
