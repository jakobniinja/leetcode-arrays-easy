package CW;


import org.apache.commons.lang3.StringUtils;

import static java.util.Spliterator.SORTED;
import static java.util.Spliterators.spliteratorUnknownSize;

import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.StreamSupport.stream;
import static org.apache.commons.math3.util.CombinatoricsUtils.combinationsIterator;


public class PosAverage {
    public static double posAverage(String s) {
    String[] strings = s.split(",");
    int matchs = 0;
    double of = 0;
    for (int i = 0; i < strings.length; i++)
      strings[i] = strings[i].trim();
    for (int i = 0; i < strings.length; i++) {
        for (int j = i + 1; j < strings.length; j++)
            for (int k = 0; k < strings[i].length(); k++) {
                matchs += (strings[i].charAt(k) == strings[j].charAt(k)) ? 1 : 0;
                of++;
            }
    }
    return matchs * 100 / of;
    }

    public static void main(String[] args) {
        System.out.println(posAverage("64040600, 64464440, 60006040, 49609906, 46664409, 99464446, 90446964, 96940090"));
    }
}
