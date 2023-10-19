package com.lightning_flash.aot.common.commands.enums;

public enum RegEnum
{
    BLOCKS      ("blocks"),
    ITEMS       ("items"),
    FLUIDS      ("fluids"),
    ENTITIES    ("entities"),
    BIOMES      ("biomes");

    private final String value;

    RegEnum(String value) { this.value = value; }

    public String getValue() { return value; }
}