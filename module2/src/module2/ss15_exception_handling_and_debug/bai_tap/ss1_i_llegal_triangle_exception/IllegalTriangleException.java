package module2.ss15_exception_handling_and_debug.bai_tap.ss1_i_llegal_triangle_exception;

import java.util.Scanner;

public class IllegalTriangleException extends Exception {

    public IllegalTriangleException() {
    }
    public IllegalTriangleException(String message) {
        super(message);
    }
}