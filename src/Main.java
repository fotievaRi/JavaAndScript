import java.util.*;

public class Main {
    public static void main(String[] args){
        List<MembersGroup> listMG = new ArrayList<>();
        List<Member> listM1 = new ArrayList<>();
        List<Member> listM2 = new ArrayList<>();

        listM1.add(new Member("Lera", 18));
        listM1.add(new Member("Rita", 21));
        listM1.add(new Member("Sasha", 33));

        listM2.add(new Member("Vlad", 19));
        listM2.add(new Member("Ira", 23));
        listM2.add(new Member("Dima", 15));

        listMG.add(new MembersGroup("group1", listM1));
        listMG.add(new MembersGroup("group2", listM2));

        System.out.println(Finder.findOldMembers(listMG, 20).toString());
    }
}
