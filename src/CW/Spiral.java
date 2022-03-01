package CW;


import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Spiral {
    public static BigInteger spiral(BigInteger size) {
        System.out.println((int) (12 * Math.PI));
        Predicate<String> numberStartWith07 = (num -> num.startsWith("07") && num.length() == 10);
        System.out.println(numberStartWith07.test("0720271553"));
        return size.pow(2).divide(BigInteger.TWO).add(size).subtract((size.mod(BigInteger.TWO)
                .equals(BigInteger.ZERO)) ? BigInteger.ONE : BigInteger.ZERO);
    }

    public static class Person {
        private final String name;
        private final int age;

        public Person(final String theName, final int theAge) {
            this.name = theName;
            this.age = theAge;
        }


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public int ageDifference(final Person other) {
            return age - other.age;
        }
    }

    public static void main(String[] args) {
        System.out.println(spiral(BigInteger.TEN));


        Comparator<Person> compareAgeAsc = Person::ageDifference;
        compareAgeAsc.reversed();


        final Function<Person, Integer> byAge = p -> p.getAge();
        final Function<Person, String> byName = p -> p.getName();



        final List<Person> people = Arrays.asList(
                new Person("David", 14),
                new Person("Jakob", 22),
                new Person("Lina", 45),
                new Person("Anton", 40)
        );
        people.stream().sorted(compareAgeAsc.reversed());
        people.stream().sorted((p1, p2) -> p1.getName().compareTo(p2.getName()));

        people.stream().sorted(Comparator.comparing(byName).thenComparing(byAge));


    }
}
