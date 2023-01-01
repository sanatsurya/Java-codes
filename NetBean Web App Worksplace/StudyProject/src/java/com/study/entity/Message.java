
package com.study.entity;
public class Message {
    private String contents;
    private String type;
    private String css;
    //Constructors
    public Message(String contents, String type, String css) {
        this.contents = contents;
        this.type = type;
        this.css = css;
    }
    //Getters and Setters

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCss() {
        return css;
    }

    public void setCss(String css) {
        this.css = css;
    }
    
}
