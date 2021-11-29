package com.gdw888.designpattern.factory;

public class FactoryDesignPattern {

	public interface Burger{
		public void prepare();
	}
	
	public class BeefBurger implements Burger{

		@Override
		public void prepare() {
				System.out.println("preparing");
		}
		
	}
	
	public abstract class Restraurant{
		
		public Burger orderBurger() {
			Burger burger = createBurger();
			burger.prepare();
			return burger;
		}
		
		protected abstract Burger createBurger();
	}
	
	public class BeefBurgerRestuarant extends Restraurant{

		@Override
		public Burger createBurger() {
			return new BeefBurger();
		}
	}
	
	public static void main(String arg[]) {
		FactoryDesignPattern test = new FactoryDesignPattern();
		test.test();
	}
	
	public void test() {
		Restraurant beef = new BeefBurgerRestuarant();
		beef.orderBurger();
	}
}
