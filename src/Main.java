public class Main {

    public static void main(String[] args) {
        Zombie test = new Zombie("Normal");
        Zombie test2 = new Zombie("Fast", new String[]{"Machine Guns"});
        Zombie test3 = new Zombie("Monster", new String[]{"Machine Guns", "Explosives", "Sulfuric Acid"});

        System.out.println(test);
        System.out.println(test2);
        System.out.println(test3);

        ZombieTracker testTracker = new ZombieTracker();

        testTracker.addPreexistingZombie(test);
        testTracker.addWeaknessToZombie("Normal", "Spears");
        System.out.println(testTracker.getZombieToString("Normal"));
        testTracker.addWeaknessToZombie("Wild", "Fire");
        testTracker.addZombie("Wild");
        testTracker.addZombieWithWeaknesses("Colossal", new String[]{"Rocket Launcher", "Fireworks", "Mines"});
        System.out.println(testTracker.getZombieToString("Colossal"));
        testTracker.removeWeaknessFromZombie("Colossal", "Fireworks");
        System.out.println(testTracker.getZombieToString("Colossal"));
        System.out.println(testTracker.getZombiesWeaknesses("Normal"));
        System.out.println(testTracker.getZombiesWeaknesses("Wierd"));
    }
}
