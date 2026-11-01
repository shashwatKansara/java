package shows;

public class Main {
    public static void main(String[] args) {
        movies newMovie = new movies();
        newMovie.setShowName(" Raid 2 ");
        newMovie.setDuration(210);
        newMovie.setActName(" Ajay Devgan ");
        newMovie.setActressName(" Vaani Kapoor ");
        newMovie.setRating(8.8);
        newMovie.setCameraMan(" Matt Flannery ");
        newMovie.setDirector(" Gareth Evans ");
        newMovie.setMaintenanceCost(3500000);
        newMovie.displayInfo();
    }
}
