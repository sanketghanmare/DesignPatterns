package com.sk101.command.editor;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document, history);
        boldCommand.execute();

        System.out.println(document.getContent());

        var undocommand = new UndoCommand(history);
        undocommand.execute();
        System.out.println(document.getContent());
    }
}
