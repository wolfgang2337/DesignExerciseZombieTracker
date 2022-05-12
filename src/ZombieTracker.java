import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ZombieTracker {
    private final Map<String,Zombie> ZombieMap;

    public ZombieTracker() {
        ZombieMap = new HashMap<>();
    }

    public void addZombie(String name) {
        ZombieMap.put(name, new Zombie(name));
    }

    public void addZombieWithWeaknesses(String name, String[] weaknesses) {
        ZombieMap.put(name, new Zombie(name, weaknesses));
    }

    public void addPreexistingZombie(Zombie zombie) {
        ZombieMap.put(zombie.getName(), zombie);
    }

    public void addWeaknessToZombie(String name, String weakness) {
        if(ZombieMap.containsKey(name)) {
            ZombieMap.get(name).addWeakness(weakness);
        } else {
            System.out.printf("No Zombie with name %s found%n", name);
        }
    }

    public void removeWeaknessFromZombie(String name, String weakness) {
        if(ZombieMap.containsKey(name)) {
            ZombieMap.get(name).removeWeakness(weakness);
        } else {
            System.out.printf("No Zombie with name %s found%n", name);
        }
    }

    public String getZombieToString(String name) {
        if(ZombieMap.containsKey(name)) {
            return ZombieMap.get(name).toString();
        } else {
            System.out.printf("No Zombie with name %s found%n", name);
            return null;
        }
    }

    public Set<String> getZombiesWeaknesses(String name) {
        if(ZombieMap.containsKey(name)) {
            return ZombieMap.get(name).returnWeaknesses();
        } else {
            System.out.printf("No Zombie with name %s found%n", name);
            return null;
        }
    }
 }
