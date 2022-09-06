package chapters.chapter_04;

public class Exercise4_25 {

	public static void main(String[] args) {

		String str1="ABCDEFGHIJKLMNOPQRSTUWVXYZ";
		String str2="0123456789";
		int i1=(int) (Math.random()*27);
		int i2=(int) (Math.random()*27);
		int i3=(int) (Math.random()*27);
		int i4=(int) (Math.random()*10);
		int i5=(int) (Math.random()*10);
		int i6=(int) (Math.random()*10);
		int i7=(int) (Math.random()*10);
		char s1= str1.charAt(i1);
		char s2= str1.charAt(i2);
		char s3= str1.charAt(i3);
		char l1= str2.charAt(i4);
		char l2= str2.charAt(i5);
		char l3= str2.charAt(i6);
		char l4= str2.charAt(i7);
		System.out.println(s1+""+s2+""+s3+""+l1+""+l2+""+l3+""+l4);
	}

}
