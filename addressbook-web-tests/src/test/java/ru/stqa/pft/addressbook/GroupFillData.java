package ru.stqa.pft.addressbook;

public class GroupFillData //инициализация объекта значениями
{
    private final String name;
    private final String header;
    private final String footer;

    public GroupFillData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }
//методы , которые возвращают атрибуты
    public String getName() {
        return name;
    }

    public String getHeader() {
        return header;
    }

    public String getFooter() {
        return footer;
    }
}
