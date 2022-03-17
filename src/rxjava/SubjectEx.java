package rxjava;


import io.reactivex.internal.d.e.A;
import io.reactivex.rxjava3.subjects.AsyncSubject;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;
import io.reactivex.rxjava3.subjects.BehaviorSubject;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class SubjectEx {
    public static void main(String[] args) {
        Subject<String> subject = PublishSubject.create();
        subject.subscribe(e -> System.out.println("ob1 : " + e));
        subject.onNext("1");
        subject.onNext("2");
        subject.onNext("4");

        subject.subscribe(e -> System.out.println("ob2: " + e));
        subject.onNext("5");
        subject.onNext("9");
        subject.onNext("13");

        subject.onComplete();


        System.out.println(pascalsTriangle(5));
    }

    public static List<List<Integer>> pascalsTriangle(int n){
        List<List<Integer>> triangle = new ArrayList();
        if(n == 1) return triangle;


        List<Integer> fRow = new ArrayList();
        fRow.add(1);
        triangle.add(fRow);


        for (int i = 1; i < n; i++) {
            List<Integer> pRow = triangle.get(i-1);
            ArrayList<Integer> cRow = new ArrayList();
            cRow.add(1);

            for (int j = 1; j < i; j++) {
                cRow.add(pRow.get(j-1) + pRow.get(j));
            }
            cRow.add(1);
            triangle.add(cRow);

        }
        return triangle;
    }

}