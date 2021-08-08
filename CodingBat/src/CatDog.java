
public class CatDog {

	public static void main(String[] args) {
		System.out.println(catDog("catDog"));
	}
	
	public static boolean catDog(String str) {
		  int catCount =0;
		  int dogCount =0;
		  for(int i=0;i<str.length()-1;i++){
		    if(str.substring(i,i+2).equals("cat")){
		      catCount++;
		    }
		    if(str.substring(i,i+2).equals("dog")){
		      dogCount++;
		    }
		  }
		  if(catCount==dogCount){
		    return true;
		  }
		  return false;
		}

}
