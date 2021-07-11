package com.sk101.iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {

    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }
    public String pop() {
        var lastIndex = urls.size() - 1;
        var url = urls.get(lastIndex);
        urls.remove(url);
        return url;
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator<String> {

        private BrowseHistory history;
        private int index;

        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return (index < history.urls.size());
        }

        @Override
        public String Current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
