package solid.lsp;

public class Bob extends Person {

    @Override
    void walk() {
        // 리스코프 치환원칙 위배
        System.out.println("하늘을 납니다");
    }
}
