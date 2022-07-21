
public class StringBufferTest {

	public static void main(String[] args) {
		//Thread safe, Synchron
		StringBuffer sbf = new StringBuffer("Megala");
		StringBuffer sbf1 = new StringBuffer("Megala");
		System.out.println(sbf.hashCode());
		System.out.println(sbf1.hashCode());
		
		StringBuffer tst = sbf.reverse();
		System.out.println(tst.hashCode());
		System.out.println(sbf==sbf1);
		System.out.println(sbf.equals(sbf1));
		
	}

}
