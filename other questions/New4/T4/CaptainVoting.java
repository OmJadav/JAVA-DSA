import java.io.*;
import java.util.*;

public class CaptainVoting {
    public static void main(String[] args) throws IOException {
        HashMap<String, Captain> captains = new HashMap<>();
        captains.put("Rohit", new Captain("Rohit", 32, "Mi"));
        captains.put("Dhoni", new Captain("Dhoni", 39, "CSK"));
        captains.put("Virat", new Captain("Virat", 30, "RCB"));
        captains.put("Hardik", new Captain("Hardik", 31, "GT"));
        captains.put("Rishabh", new Captain("Rishabh", 29, "DC"));

        System.out.println("Printing Captains Details::");
        for (Captain c : captains.values()) {
            System.out.println(c);
        }
        ArrayDeque<String> votingSequence = new ArrayDeque<>();
        for (int i = 1; i <= 50; i++) {
            String voterName = "Voter-" + i;
            String selectedCaptain = getRandomCaptain(captains);
            votingSequence.add(voterName + " Voted for " + selectedCaptain);
        }
        System.out.println(votingSequence);

        BufferedWriter br = new BufferedWriter(new FileWriter("votingResult.txt"));
        br.write("Captain Details :\n");
        for (Captain c : captains.values()) {
            br.write(c + "\n");
        }
        br.write("\nVoiting Sequence ::\n");
        for (String vote : votingSequence) {
            br.write(vote + "\n");
        }

        HashMap<String,Integer> voteCount=new HashMap<>();
        for(Captain c:captains.values()){
            voteCount.put(c.name,0);
        }
        for(String s:votingSequence){
            String sc=s.substring(s.lastIndexOf(' ')+1);
            voteCount.put(sc,voteCount.get(sc)+1);
        }
        System.out.println("total Votes : "+voteCount);
        br.write("\nVote Count :: ");

        for(Map.Entry <String,Integer> vc:voteCount.entrySet()){
            String name=vc.getKey();
            int v=vc.getValue();
            double percentage=(v/50.0)*100;
            System.out.println("Captain "+name+ " got " +percentage + "% votes");
            br.write(name+" got "+percentage+"% votes\n");
        }
        br.close();
    }

    public static String getRandomCaptain(HashMap<String, Captain> captains) {
        ArrayList<String> cname = new ArrayList(captains.keySet());
        int randomIndex = (int) (Math.random() * 5);
        return cname.get(randomIndex);
    }
}

class Captain {
    String name;
    int age;
    String team;

    Captain(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Team: " + team;
    }
}
