package com.exercicio01.solid;

public class EmailContentImpl implements EmailContent {

    private TypeFormat type;
    private String content;

    public TypeFormat getType() {
        return type;
    }

    public void setType(TypeFormat type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
