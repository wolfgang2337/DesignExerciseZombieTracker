import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zombie {
    private final String name;
    private final Set<String> weaknesses;

    public Zombie(String name) {
        this.name = name;
        weaknesses = new HashSet<>();
    }

    public Zombie(String name, String[] weaknesses) {
        this.name = name;
        this.weaknesses = new HashSet<>(List.of(weaknesses));
    }

    public void addWeakness(String weakness) {
        weaknesses.add(weakness);
    }

    public void removeWeakness(String weakness) {
        weaknesses.remove(weakness);
    }

    public Set<String> returnWeaknesses() {
        return weaknesses;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        if(weaknesses.size() == 0) {
            return String.format("Type of Zombie named %s with no known weaknesses", name);
        } else if (weaknesses.size() == 1) {
            return String.format("Type of Zombie named %s with 1 weakness: %s", name, weaknesses);
        } else {
            return String.format("Type of Zombie named %s with %d weaknesses: %s", name, weaknesses.size(), weaknesses);
        }
    }
}
