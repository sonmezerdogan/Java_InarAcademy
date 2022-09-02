package chapters.chapter_04;

public class Exercise4_16 {

	public static void main(String[] args) {
		int i=(int)(Math.random()*52);
		//System.out.println(i);
		String str1= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		System.out.println(str1.substring(i,(i+1)));
	}

}
