package AbstractFactory;

import AbstractFactory.factory.Factory;
import AbstractFactory.factory.Link;
import AbstractFactory.factory.Page;
import AbstractFactory.factory.Tray;

public class Main {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("listfactory.ListFactory");
        Link people = factory.createLink("人民日报","www.people.com.cn");

        Tray traynews = factory.createTray("日报");

        traynews.add(people);

        Page page = factory.createPage("linkpage","me");
        page.add(traynews);
        page.output();

    }
}
