package AbstractFactory.listfactory;

import AbstractFactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        return null;
    }
}
