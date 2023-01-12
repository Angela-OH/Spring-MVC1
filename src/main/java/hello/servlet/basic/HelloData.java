package hello.servlet.basic;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter // lombok이 getter, setter를 자동으로 만들어줌
public class HelloData {
    private String username;
    private int age;
}
