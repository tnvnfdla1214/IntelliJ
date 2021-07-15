package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null;

    private SocketClient(){ //defalt 생성자로 막고
    }
//    public SocketClient(){
//
//    }

    public static SocketClient getInstance(){
        if(socketClient == null){
            socketClient = new SocketClient();
        }
        return socketClient;
    }

    public void connect(){
        System.out.println("connect");
    }
}
