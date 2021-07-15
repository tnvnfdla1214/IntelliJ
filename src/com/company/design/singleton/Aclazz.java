package com.company.design.singleton;

public class Aclazz {

    private SocketClient socketClient;

    public Aclazz(){
        this.socketClient = SocketClient.getInstance();
        //this.socketClient = new SocketClient(); //<- 새로 생성자 설정한거임 싱글톤 x
    }

    public SocketClient getSocketClient(){
        return this.socketClient;
    }
}
