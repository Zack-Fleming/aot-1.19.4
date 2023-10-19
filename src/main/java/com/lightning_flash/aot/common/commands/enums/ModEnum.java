package com.lightning_flash.aot.common.commands.enums;

public enum ModEnum
{
    MINECRAFT   ("mine"),
    FORGE       ("forge"),
    AOT         ("aot");

    private final String value;

    ModEnum(String val) { this.value = val; }

    public String getValue() { return this.value; }
}