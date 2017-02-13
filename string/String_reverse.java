package string;
/*Given an input string, reverse the string word by word.

Example:

Given s = "the sky is blue",

return "blue is sky the".
*/
public class String_reverse {
	public static String reverse(String Str){
		String[] split = Str.split("\\s+");
		StringBuilder str = new StringBuilder("");
		
		for(int i=split.length-1;i>=0;i--){
			str.append(split[i]+" ");
		}
		return str.toString().trim();
		
	}
	public static void main(String args[]){
		String str = "i am ashima";
		String rev = reverse(str);
		System.out.println(rev);
		
	}

}
