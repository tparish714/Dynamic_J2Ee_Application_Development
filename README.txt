[SQL]
Please follow the steps when creating a database:
	Step1: create a database named "TheaterDB"
	Step2: create all the entities and let JPA create the tables
	Step3: run the sql script to insert values to the tables
	*** when inserting values, must check if the value sequence matches the column sequence

[Java]
Entity package: used to create tables in the database
	- Location contains:
		fields: String theaterLocations, 
			String zipcode
		named queries: Location.findAll, 
			       Location.findByZipcode
	
	- Movie contains:
		field: String movieName
		named queries: Movie.findAll: used to populate a movie list
			       Movie.findByName: used to populate a movie list by a name
			       Movie.findByLocation: used to populate a movie list by a location
			
	- MovieShowing contains:
		filed: MovieShowingPK movieShowingsPK
		named queries: MovieShowing.findAll,
			       MovieShowing.findByNameForLocation

	- MovieShowingPK contains:
		fields: String theaterLocation,
			String showtime,
			String movieName

EJB package: use named queries to populate data for web use
	- theaterEJB contains:
		methods: List<Location> findAllLocations(),
			 List<Location> getLocationsForZipcode(String zipcode),
			 List<Movie> findAllMovies(),
			 List<MovieShowing> getMoviesForLocation(String theaterlocation),
			 List<String> noDuplicate(List<MovieShowing> showing),
			 List<MovieShowing> findAllShowings(),
			 List<MovieShowing> getShowtimesForMovie(String movieName, String theaterLocation)
			
CDI package: used to evoke methods in theaterEJB to retrieve data from the database
	- showLocationBean
	- showMoviesBean
	- showShowingsBean
	- paymentBean

[Web]
Home: more for aesthetic purpose

Locations: display a map and table showing all the locations in all the zipcodes

GetTickets: show zip codes and have the user pick one; 
	    pass the zipcode picked to "showLocationsBean.showLocationList"

LocationsByZipcode: show locations in the zip code picked and have the user pick one;
	   	    pass the location picked to "showMoviesBean.showMovieList(item.theaterLocation)"

MoviesByLocation: show movies airing at the location picked and have the user pick one;
		  pass the movie pocked to "showMoviesBean.showShowtimes"

Showtimes: show the movie description and showtimes for the movie picked and have the user pick a showtime;
	   pass the showtime to "paymentBean.toSeating(item.movieShowingPK.showtime)"

Seating: display an interactive seating chart and let the user select the seats wanted;
	 store the number of seats selected (js)

Payment: display a summary for the order( movie name, theater location, showtime, ticket qty, and total amount);
	 let the user enter payment details; 
	 all fields are required and validate the card number

ThankYou: display a thank you message;
	  have options to go back to the Home page or GetTicket page
