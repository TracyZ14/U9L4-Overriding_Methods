public class GamingDesktop extends Desktop
{
    private String graphicsCard;

    public GamingDesktop(int screenSize, int memory, boolean moniterIncluded, String graphicsCard)
    {
        super(screenSize, memory, moniterIncluded);
        this.graphicsCard = graphicsCard;
    }

    public void updateGraphicsCard(String newGraphicsCard)
    {
        graphicsCard = newGraphicsCard;
        System.out.println("The graphics card is updated to " + newGraphicsCard + ".");
    }
}