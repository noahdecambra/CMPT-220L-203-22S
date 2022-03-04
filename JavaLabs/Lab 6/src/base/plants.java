package base;

public class plants
{
    boolean needsWatering;
    String plantFamily;
    String name;
    String wateringInstructions;
    boolean sunlightrequired;

    public plants (boolean needsWatering, String plantFamily, String name)
    {
        this.needsWatering = needsWatering;
        this.plantFamily = plantFamily;
        this.name = name;
        this.sunlightrequired = true;
        this.wateringInstructions = "water once a week";

        announce();
    }

    public void announce()
    {
        System.out.println("Plant:");
    }
}