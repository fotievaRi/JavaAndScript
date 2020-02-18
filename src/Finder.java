import java.util.*;
import java.util.stream.Collectors;

public class Finder {
    /**
     * Поиск групп людей старше определенного возраста.
     *
     * @param groups    группы
     * @param targetAge возраст для поиска
     * @return список имен групп из списка групп старше возраста targetAge
     */
    public static Set<String> findOldMembers(List<MembersGroup> groups, int targetAge) {
        return groups.stream().map(m -> m.getMembers())
                .flatMap(List::stream).distinct()
                .filter(a -> a.getAge() > targetAge)
                .map(n -> n.getName())
                .collect(Collectors.toSet());
    }
}
