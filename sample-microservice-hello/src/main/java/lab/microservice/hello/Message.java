package lab.microservice.hello;

import java.time.LocalDate;

public class Message {
    public String text;
    public String author;
    public LocalDate date;

    public Message(){

    }
    
    public Message(String text, String author, LocalDate date) {
        this.text = text;
        this.author = author;
        this.date = date;
    }

    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }

}
