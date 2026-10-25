package AbstractFactory;

public interface Region {
	PaymentProvider getProvider(String name);
	Tax taxMethodology();
}
