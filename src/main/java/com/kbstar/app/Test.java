package com.kbstar.app;

public class Test {
    public static void main(String args[]){
        TestService service = new TestService();
        service.register();
        // 자바는 객체지향인데, 대신 클래스가 많아지고 클래스들 간의 관계가 복잡해지면 서로의 dependency 때문에 어느 하나가 수정되거나 삭제되면 다른 클래스들에 영향을 미치게 됨
    }
}
