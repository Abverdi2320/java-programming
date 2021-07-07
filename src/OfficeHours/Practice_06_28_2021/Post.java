package OfficeHours.Practice_06_28_2021;

import java.time.LocalDateTime;

public class Post {
    private  String body;
  //  private final String DATE_TIME;
  public static void main(String[] args) {
      System.out.println(LocalDateTime.now());
  }

    Post(String body){
        this.body=body;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//    public String getDATE_TIME() {
//        return DATE_TIME;
//    }


}
