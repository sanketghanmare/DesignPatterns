package com.sk101.memento.exercise;

import com.sk101.memento.Editor;
import com.sk101.memento.History;

public class Main {
    public static void main(String[] args) {
        var document = new Document();
        var history = new DocumentHistory();

        document.setContent("hi");
        history.push(document.createDocumentState());

        document.setFontName("Arial");
        history.push(document.createDocumentState());

        document.setFontSize(12);
        history.push(document.createDocumentState());

        document.setFontSize(18);
        history.push(document.createDocumentState());

        document.restore(history.pop());

        System.out.println(document);
    }
}

