package com.ciq.objectcdemo;

public class ObjectFinalizedDemo {

	private int id;

	public ObjectFinalizedDemo(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	@Override
	protected void finalize() throws Throwable {
//		super.finalize();
		System.out.println("finalize method invoked **********************************************");
	}

	public static void main(String[] args) {
//		ObjectFinalizedDemo demo=new ObjectFinalizedDemo(1);
//		System.out.println(demo.getId());

		for (int i = 0; i < 100000; i++) {

			System.out.println(new ObjectFinalizedDemo(i));

		}

	}

}
