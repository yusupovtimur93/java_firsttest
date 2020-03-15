package ru.stqa.pft.addressbook.model;

import java.util.Objects;

public class GroupDate {


    private int id = Integer.MAX_VALUE;
    private String name;
    private String header;
    private String footer;

    public GroupDate withName(String name) {
        this.name = name;
        return this;
    }

    public GroupDate withHeader(String header) {
        this.header = header;
        return this;
    }

    public GroupDate withFooter(String footer) {
        this.footer = footer;
        return this;
    }

    public GroupDate withId(int id) {
        this.id = id;
        return this;
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
