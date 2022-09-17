package _04_netflix;

public class Netflix_player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Movie movie1 = new Movie("Star Wars", 5);
		Movie movie2 = new Movie("Star Trek", 1);
		Movie movie3 = new Movie("Jaws", 3);
		Movie movie4 = new Movie("Lord of the Rings", 4);
		Movie movie5 = new Movie("Lord of the Necklases", 2);
		System.out.println(movie1.getTicketPrice());
		System.out.println(movie2.getTicketPrice());
		System.out.println(movie3.getTicketPrice());
		System.out.println(movie4.getTicketPrice());
		System.out.println(movie5.getTicketPrice());
		NetflixQueue queue = new NetflixQueue();
		queue.addMovie(movie1);
		queue.addMovie(movie2);
		queue.addMovie(movie3);
		queue.addMovie(movie4);
		queue.addMovie(movie5);
		queue.printMovies();
		System.out.println("The best movie is " + queue.getBestMovie(0));
		System.out.println("The seccond best movie is " + queue.getBestMovie(1));
	}

}
