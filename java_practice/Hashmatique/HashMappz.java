import java.util.HashMap;
import java.util.Set;


public class HashMappz {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Pop Song", "ooh ooh, baby, baby");
        trackList.put("Punk Song", "Mickey Mouse is dead");
        trackList.put("Love Song", "I'll never get over you");
        trackList.put("Country Song", "'Merica that's why budweiser twang");

        String blaap = trackList.get("Pop Song");
        System.out.println("We should open with the song that goes"+ " " + blaap);

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println(key + " : " + trackList.get(key));
        }
    }
}
