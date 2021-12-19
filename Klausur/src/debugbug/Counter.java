package debugbug;

public class Counter extends java.lang.Object {

    private int result = 0;

    int getResult() {

        return this.result;
    }

    public void count() {

        for (int i = 0; i < 100; i++) { //i) einen Breakpoint

            this.result += i + 1;
        }
    }

	public Counter() {
		super();
		
	}
    
    
}
