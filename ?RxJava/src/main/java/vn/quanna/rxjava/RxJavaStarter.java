package vn.quanna.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;

public class RxJavaStarter {
    public static void main(String[] args) {
        Observable<String> myObser = Observable.just("Hello", "RxJava", "World", "!!!");
        myObser.subscribe(str -> System.out.print(str + " "));
    }
}
