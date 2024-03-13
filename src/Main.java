class Main
{
    public static void main(String[] args)
    {
        // test your new GamingDesktop class here by
        // creating a GamingDesktop object and call the new method
        GamingDesktop myGamingDesktop = new GamingDesktop(12345, 67890, true, "Graphics Card 1");
        myGamingDesktop.updateGraphicsCard("Graphics Card 2");

        System.out.println(myGamingDesktop instanceof Object);
        System.out.println(myGamingDesktop instanceof Computer);
        System.out.println(myGamingDesktop instanceof Desktop);
        System.out.println(myGamingDesktop instanceof GamingDesktop);
    }
}