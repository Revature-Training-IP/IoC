package com.revature.spring.ioc;

public class MessageService {
    private String message;

public MessageService() {
    }

public MessageService(String message){
    this.message=message;
}

public String getMessage() {
    return message;
}

public void setMessage(String message) {
    this.message = message;
}

public void printMessage(){
    System.out.println("Message: "+message);
}

}
