package arrays;

public class TimeRequireToBuy {
    public static int timeRequireToBuy(int[] tickets, int k) {
        int sec =0;
        int targetTickets = tickets[k];

        for(int i =0; i< tickets.length; i++){
            if(i <=k){
                sec += Math.min(tickets[i], targetTickets);
            }else {
                sec += Math.min(tickets[i], targetTickets -1);
            }
        }
        return sec;
    }

    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        System.out.println(timeRequireToBuy(tickets, 0));
    }
}
