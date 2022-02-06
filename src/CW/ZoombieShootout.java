package CW;

public class ZoombieShootout {
    public static String zoombieShootout (int zombies, int range, int ammo) {
        for(int shot = 0; shot < zombies; shot++, ammo--){
            if(shot != 0 && shot %2 ==0){
                range--;
            }
            if(range <= 0){
                return String.format("You shot %d zombies before being eaten: overwhelmed.", shot);
            }
            if(ammo<= 0){
                return String.format("You shot %d zombies before being eaten: ran out of ammo.", shot);
            }
        }
        return String.format("You shot all %d zombies.", zombies);
    }
}
