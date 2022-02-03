package CW;

public class DiceRotation {
    public static int rotate(int[] dieArr) {
        int[] ways = new int[dieArr.length] ;
        int round;
        for (int i = 0; i < dieArr.length; i++) {
            round =0;
            switch(dieArr[i]){
                case 1:
                    for(int x : dieArr){
                        if(x == 6){
                            round += 2;
                        }else if(x != dieArr[i]){
                            round ++;
                        }
                    }
                break;
                case 2:
                    for(int x : dieArr){
                        if(x == 5){
                            round += 2;
                        }else if (x != dieArr[i]){
                            round ++;
                        }
                    }
                    break;
                case 3:
                    for(int x : dieArr){
                        if(x == 4){
                            round += 2;
                        }else if (x != dieArr[i]){
                            round ++;
                        }
                    }
                    break;
                case 4:
                    for(int x : dieArr){
                        if(x == 3){
                            round += 2;
                        }else if (x != dieArr[i]){
                            round ++;
                        }
                    }
                    break;
                case 5:
                    for( int x : dieArr){
                        if (x == 2){
                            round += 2;
                        }else if (x != dieArr[i]){
                            round ++;
                        }
                    }
                    break;
                case 6:
                    for(int x : dieArr){
                        if( x == 1){
                            round += 2;
                        }else if (x != dieArr[i]){
                            round ++;
                        }
                    }
                    break;
            }
            ways[i] =  round ;
        }
        int answer = ways.length> 0 ? ways[0] : 0;
        for(int way : ways){
            if(answer >= way){
                answer = way;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(rotate(new int[] {1,2,3}));
        System.out.println(rotate(new int[] {3,3,3}));
        System.out.println(rotate(new int[] {1,6,2,3}));
    }
}
