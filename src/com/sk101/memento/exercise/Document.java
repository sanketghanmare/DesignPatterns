package com.sk101.memento.exercise;

import com.sk101.memento.EditorState;

public class Document {

    private String content = "";
    private String fontName = "";
    private float fontSize;


    public DocumentState createDocumentState() {
        return new DocumentState(content,fontName,fontSize);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public float getFontSize() {
        return fontSize;
    }

    public void setFontSize(float fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return content + " " + fontName + " " + fontSize;
     }

    public void restore(DocumentState pop) {
        this.content = pop.getContent();
        this.fontName = pop.getName();
        this.fontSize = pop.getSize();
    }
}
