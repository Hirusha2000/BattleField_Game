import java.util.concurrent.ThreadLocalRandom;

public class Pistol implements Weapon{
    static int rand;
    @Override
    public  void Shoot() {
        ThreadLocalRandom random = ThreadLocalRandom. current();
        rand = random. nextInt(1, 11);

    }
    @Override
    public  int getScore() {
        return rand;
    }
}
