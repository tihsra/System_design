package Factory;

public class Client {
	public static void main(String args[]) {
		Factory object1 = QuerryFactory.create("MongoDb");
		object1.createQuerry();
		Factory object2 = QuerryFactory.create("Postgres");
		object2.createQuerry();
		//Factory object3 = QuerryFactory.create("MongoData");


	}
}


// 