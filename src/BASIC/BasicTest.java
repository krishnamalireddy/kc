package BASIC;




public class BasicTest {
	public int i; // public by default
	@SuppressWarnings("unused")
	private int j; // private to A

	void setij(int x, int y) {
		i = x;
		j = y;
	}
}
