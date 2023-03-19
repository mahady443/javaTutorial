package Implementingitertable;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable {
    private LinkedList<String> list = new LinkedList<>();

    public UrlLibrary(){
        list.add("https://www.google.com/");
        list.add("https://www.facebook.com/");
        list.add("https://news.google.com/");
    }

    @Override
    public Iterator iterator() {
        return list.iterator();
    }
}
