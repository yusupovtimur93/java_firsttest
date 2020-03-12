package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupDate {
    private final String name;
    private int id;
    private final String header;
    private final String footer;

    public void setId(int id) {
        this.id = id;
    }

    public GroupDate(int id, String name, String header, String footer) {
        this.id = id;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
    public GroupDate(String name, String header, String footer) {
        this.id = Integer.MAX_VALUE;
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }

    @Override
    public String toString() {
        return "GroupDate{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object text) {
        if (this == text) return true;
        if (text == null || getClass() != text.getClass()) return false;
        GroupDate groupDate = (GroupDate) text;
        return Objects.equals(name, groupDate.name) &&
                Objects.equals(id, groupDate.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
