package arrays;

public class MinMovesToSeat {
    public static int minMovesToSeat(int[] seats,int[] students) {
          bubbleSort(seats);
        bubbleSort(students);

        int sum = 0, count = 0;
        while (count < seats.length) {
            sum += Math.abs(students[count] - seats[count]);
            count++;
        }
        return sum;
    }

    private static int[] bubbleSort(int[] arr) {
              for (int i = 0; i < arr.length; i++) {
                  for (int j = 1; j < arr.length - i; j++) {
                      if (arr[j] < arr[j - 1]) {
                          int temp = arr[j];
                          arr[j] = arr[j - 1];
                          arr[j - 1] = temp;
                      }
                  }
              }
        return arr;
    }

    public static void main(String[] args) {
        int[] seats={3,1,5};
        int[] students={2,7,4};
        System.out.println(minMovesToSeat(seats, students));
    }
}
