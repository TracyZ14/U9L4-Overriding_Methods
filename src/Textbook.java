public class Textbook extends Book
{
    private int editionNumber;

    public Textbook(String title, double price, int editionNumber)
    {
        super(title, price);
        this.editionNumber = editionNumber;
    }

    public String getBookInfo()
    {
        return(super.getBookInfo() + "-" + editionNumber);
    }

    public int getEdition()
    {
        return editionNumber;
    }

    public boolean canSubstitueFor(Textbook anotherTextbook)
    {
        if(getTitle().equals(anotherTextbook.getTitle()))
        {
            if(editionNumber >= anotherTextbook.getEdition())
            {
                return true;
            }
        }
        return false;
    }
}