package vn.quanna.rxjava;

import io.reactivex.Observable;
import io.reactivex.Observer;

import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;
import static io.reactivex.Observable.fromIterable;
import static io.reactivex.Observable.fromArray;

public class RxJavaStarter {
    public static void main(String[] args) {
        out.println("Using individual object");
        Observable<String> myObser = Observable.just("Hello", " ", "RxJava", " ", "World", " ", "!!!", "\n");
        myObser.subscribe(out::print);

        out.println("Using Array");
        List<String> words = Arrays.asList(
                "the",
                "quick",
                "brown",
                "fox",
                "jumped",
                "over",
                "the",
                "lazy",
                "dogs"
        );
        fromIterable(words).subscribe(out::println);

        out.println("With Zip");
        fromIterable(words)
                .zipWith(Observable.range(1, Integer.MAX_VALUE),
                        (string, count)-> String.format("%2d. %s", count, string))
                .subscribe(out::println);

        out.println("With flatMap");
        fromIterable(words)
                .flatMap(word -> fromArray(word.split("")))
                .zipWith(Observable.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string))
                .subscribe(out::println);

        out.println("With distinct, sorted");
        fromIterable(words)
                .flatMap(word -> fromArray(word.split("")))
                .distinct()
                .sorted()
                .zipWith(Observable.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string))
                .subscribe(out::println);
    }
}
