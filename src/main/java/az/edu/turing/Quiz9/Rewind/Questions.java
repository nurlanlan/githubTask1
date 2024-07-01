//package az.edu.turing.Quiz9.Rewind;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Questions {
//    public static void main(String[] args) {
//        Box<String> result1 = divide("10", "2");
//        System.out.println(result1.getData());
//        Box<String> result2 = divide("5", "0");
//        System.out.println(result2.getData());
//    }
//    class Box<E> {
//        E data;
//        public Box(E data) {
//            this.data = data;
//        }
//        public E getData() {
//            return data;
//        }
//    }
//    public static Box<String> divide(String a, String b){
//    try {
//        int num1 = Integer.parseInt(a);
//        int num2 = Integer.parseInt(b);
//        int result = num1 / num2;
////        Box<String> stringBox = new Box<>(String.valueOf(result));
////        Box<String> stringBox1 = stringBox;
////        return stringBox1;
////    }catch (ArithmeticException e){
////        return new Box<>("Cant divide by zero");
//    }
//}
//}

