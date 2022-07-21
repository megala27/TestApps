
public class StiringBuilderTsest {

	public static void main(String[] args) {
		//not thread safe and not sync
		StringBuilder sbf = new StringBuilder("Megala");
		StringBuilder sbf1 = new StringBuilder("Megala");
		System.out.println(sbf.hashCode());
		System.out.println(sbf1.hashCode());
		
		StringBuilder tst = sbf.reverse();
		System.out.println(tst.hashCode());
		System.out.println(sbf==sbf1);
		System.out.println(sbf.equals(sbf1));
	}

	
}
