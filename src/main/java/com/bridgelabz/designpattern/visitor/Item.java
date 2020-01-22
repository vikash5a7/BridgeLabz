package com.bridgelabz.designpattern.visitor;

public interface Item {
	public int accept(ShoppingCartVisitor visitor);
}
