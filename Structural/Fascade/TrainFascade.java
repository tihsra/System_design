package Fascade;

public class TrainFascade {
	
	private FetchTrainTicket trainTicketFetcher;
	private SearchTrainTicket searchTrainTicket;
	
	TrainFascade(){
		trainTicketFetcher = new FetchTrainTicket();
		searchTrainTicket = new SearchTrainTicket();
	}
	
	void bookTrainTicket() {
		this.trainTicketFetcher.fetch();
		this.searchTrainTicket.search();
	}
}
