package Singelton;

// Method 1
//public class Store {
//	
//	private static volatile Store store;
//	
//	private Store() {
//		System.out.println("Created the Store object");
//	}
//	
//	public static Store getInstance() {
//		if(store==null) {
//			synchronized(Store.class) {
//				if(store==null) {
//					store = new Store();
//				}
//			}
//		}
//		return store;
//	}
//
//}

//Method 2
//public class Store{
//	
//	private static class Initializer{
//		private static Store store = new Store();
//	}
//	
//	public static Store getInstance(){
//		return Initializer.store;
//	}
//	
//}
//
//

//Method 3
//public enum Store{
//	insad; // if we wrote another insad2 then both would point to different objects
//	
//	public void printSome(){
//		System.out.println("I am a checker");
//	}
//}
