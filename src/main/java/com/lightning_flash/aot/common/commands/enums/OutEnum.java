package com.lightning_flash.aot.common.commands.enums;

public enum OutEnum
{
    CHAT("chat"),
    BOOK("book"),
    FILE("file");

    private final String value;

    OutEnum(String value) { this.value = value; }

    public String getValue() { return value; }
}
