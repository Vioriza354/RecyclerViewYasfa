package com.example.recyclerviewyasfa;

public class Mail {

    private String sender;
    private String title;
    private String content;
    private String date;

    public Mail(String sender,String title,String content,String date){
        this.sender = sender;
        this.title = title;
        this.content = content;
        this.date = date;
    }

    public String getDate(){return date;}

    public void setDate(String date){
        this.date = date;
    }

    public String getSender(){
        return sender;
    }

    public void setSender(String sender){
        this.sender = sender;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
