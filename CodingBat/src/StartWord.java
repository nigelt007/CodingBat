
public class StartWord {
	
	public static String startWord(String str, String word) {
		  int len = word.length();
		  if(str.length()>=len){
		    if(str.substring(0,len).equals(word)){
		    return str.substring(0,len);
		  }
		  if(len>=1){
		  if(str.substring(1,len).equals(word.substring(1))){
		    return str.substring(0,len);
		  }
		  }
		  if(!str.substring(0,len).equals(word)){
		    if(str.substring(0,len).equals(word)){
		      return str.substring(0,len);
		    }
		  }}
		  return "";
		}

	public static void main(String[] args) {
		System.out.println(startWord("hippo", "hi"));
		System.out.println(startWord("hippo", "xip"));
	}

}
