package com.ciq.objectcdemo;

public class Product {

	private int id;
	private String name;
	private double price;

//	@Override
//	public String toString() {
//		return "[" + id + name + price + "]";
//	}

	// getclass, hashcode, equal ,tostring and clone()
	// cloning

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;

	}

	public static void main(String[] args) {
		// p1 ref and p2 ref
		// p1,p2 same class---> getclass()
		Product product = new Product(1, "earbuds", 2000.00);
		Product product2 = product;
		Product product3 = new Product(1, "earbuds", 2000.00);
		System.out.println(product.getClass());
		System.out.println(product.hashCode());
		System.out.println(product2.hashCode());
		System.out.println(product3.hashCode());
		System.out.println(product.toString());

		System.out.println(product.equals(product2));// true
		System.out.println(product.equals(product3));// true
	}

//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + id;
//		result = prime * result + ((name == null) ? 0 : name.hashCode());
//		long temp;
//		temp = Double.doubleToLongBits(price);
//		result = prime * result + (int) (temp ^ (temp >>> 32));
//		return result;
//	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Product other = (Product) obj;
//		if (id != other.id)
//			return false;
//		if (name == null) {
//			if (other.name != null)
//				return false;
//		} else if (!name.equals(other.name))
//			return false;
//		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
//			return false;
//		return true;
//	}

}
