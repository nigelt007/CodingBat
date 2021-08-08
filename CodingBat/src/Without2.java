
public class Without2 {
	
	public static String without2(String str) {
		  if(str.length()>=2){
		    int ind = 0;
		    boolean found = false;
		    for(int i =0; i<str.length();i++){
		      if(!str.substring(0,i).equals(str.substring(str.length()-i))){
		        continue;
		      }else if(str.substring(0,i).equals(str.substring(str.length()-i))){
		        found = true;
		        ind = i;
		      }
		    }
		    if(found){
		      return str.substring(ind);
		    }else{
		    return "";
		    }
		  }
		  return str;
		}

	
	public static void main(String[] args) {
		System.out.println(without2("Hi"));
	}

}
