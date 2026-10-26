package Fascade;

public class Client {
	
	public static void main(String args[]) {
		
		MoviesFascade movies = new MoviesFascade();
		movies.bookMovieTicket();
		
		TrainFascade train = new TrainFascade();
		train.bookTrainTicket();
		
	}

}
