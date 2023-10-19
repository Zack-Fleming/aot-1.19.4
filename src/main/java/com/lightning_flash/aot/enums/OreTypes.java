package com.lightning_flash.aot.enums;

public enum OreTypes
{
    COM_POOR_TOP(80, 400, 20, 17),
    COM_POOR_BOT(-15, 90, 10, 17),
    COM_RICH    (-65, 15, 10, 10),
    UNC_POOR    (-10, 70, 11, 14),
    UNC_RICH    (-65, 5, 7, 8),
    RAR_POOR    (-5, 50, 8, 10),
    RAR_RICH    (-65, -5, 7, 5);


    private final int minHeight;
    private final int maxHeight;
    private final int numVeins;
    private final int veinSize;

    OreTypes(int minHeight, int maxHeight, int numVeins, int veinSize)
    {
        this.minHeight = minHeight;
        this.maxHeight = maxHeight;
        this.numVeins = numVeins;
        this.veinSize = veinSize;
    }

    public int getMinHeight() { return this.minHeight; }

    public int getMaxHeight() { return this.maxHeight; }

    public int getNumVeins() { return this.numVeins; }

    public int getVeinSize() { return this.veinSize; }
}