package arrays;

public class MaximumPopulation {
    public static int  maximumPopulation(int[][] logs) {
        int maxPopulation = 0, minYear =0;
        var pop = new int[101];

        for(var log: logs){
            for( int year =log[0]; year< log[1]; year ++){
                var x = year - 1950;
                if(++pop[x] > maxPopulation){
                    maxPopulation = pop[x];
                    minYear = year;
                }else if (pop[x] == maxPopulation && year < minYear){
                    minYear = year;
                }
            }
        }
        return minYear;
    }

    public static void main(String[] args) {
        int[][] logs = {{1950, 1961}, {1960, 1971}, {1970, 1981}};
        System.out.println(maximumPopulation(logs));
    }
}
