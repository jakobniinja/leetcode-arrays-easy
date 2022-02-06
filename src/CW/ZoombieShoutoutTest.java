package CW;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class ZoombieShoutoutTest {

    @Test
    void zoombieShoutout() {
        assertEquals("You shot all 3 zombies.", ZoombieShootout.zoombieShootout(3, 10, 10));
        assertEquals("You shot 16 zombies before being eaten: overwhelmed.", ZoombieShootout.zoombieShootout(100, 8, 200));
        assertEquals("You shot 8 zombies before being eaten: ran out of ammo.", ZoombieShootout.zoombieShootout(50, 10, 8));
    }
}