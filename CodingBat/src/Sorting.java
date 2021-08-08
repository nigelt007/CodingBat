import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sorting {
	
	public static void main(String[] args) {
		
	}
	
static String electionWinner(String[] votes) {
        
        Map<String,Integer> voteMap = new HashMap<>();
        for(String name: votes){
            if(voteMap.containsKey(name)){
                Integer count = voteMap.get(name);
                count++;
                voteMap.put(name,count);
            }else{
                voteMap.put(name,0);
            }
        }
        
        int maxVotes =0;
        for(Integer votesNo : voteMap.values()){
            if(votesNo>maxVotes){
                maxVotes =votesNo;
            }
        }
        List<String> candList = new ArrayList<String>();
        for(Map.Entry<String,Integer> entry: voteMap.entrySet()){
            if(entry.getValue()==maxVotes){
                candList.add(entry.getKey());
            }
        }
        
        Collections.sort(candList, (String o1, String o2) -> {
				    String string1 = (String) o1;
	                String string2 = (String) o2;
	                return string1.compareTo(string2);
			});
		
        
        int index = candList.size();
        return candList.get(index-1);


    }

}
