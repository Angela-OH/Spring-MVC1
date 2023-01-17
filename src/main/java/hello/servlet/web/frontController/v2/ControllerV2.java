package hello.servlet.web.frontController.v1;

import hello.servlet.web.frontController.MyView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface ControllerV2 {

    // v1과는 반환값이 다름 (MyView를 반환함)
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
}
