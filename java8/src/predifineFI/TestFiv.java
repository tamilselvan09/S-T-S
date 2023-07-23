package predifineFI;

interface CheckLength{
	boolean test (String name);
}

public class TestFiv implements CheckLength {

	@Override
	public boolean test(String name) {
		// TODO Auto-generated method stub
		return name.length()>400;
	}
	public static void main(String[] args) {
		TestFiv t1 = new TestFiv();
		
		System.out.println(t1.test("sdhgfhjdshcjdsnvhdgyfhuejdkscjdncbvwgyuewydkjcjdsncmndsvdsyewgdueue"));
	}

	

}
