package Fascade;

public class MoviesFascade {
	
	private FetchMovieTicket movieTicketFetcher;
	private SearchMovieTicket searchMovieTicket;
	
	MoviesFascade(){
		movieTicketFetcher = new FetchMovieTicket();
		searchMovieTicket = new SearchMovieTicket();
	}
	
	void bookMovieTicket() {
		this.movieTicketFetcher.fetch();
		this.searchMovieTicket.search();
	}
}
