package com.example.bookline;

public class Book {
    private String title;
    private String first_name;
    private String last_name;
    private String email;
    private String image;

    //title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    //   first name
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name){
        this.first_name = first_name;
    }
    //    last name
    public String getLast_name(){
        return last_name;
    }
    public void setLast_name(String last_name){
        this.last_name = last_name;
    }
    //    email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}