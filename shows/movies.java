package shows;

public class movies extends showCasts {
    private String genre;
    private int durationMinutes;
    private double rating;

    public void setGenre(String theGenre) {this.genre = theGenre;}
    public void setDuration(int minutes) {
        if (minutes <=0) throw new IllegalArgumentException("Invalid duration!");
        this.durationMinutes = minutes;
    }

    public void setRating(double rate) {
        if (rating < 0 || rating > 10) throw new IllegalArgumentException("Invalid Rating: Rating must be from 0-10");
        this.rating = rate;
    }

// get methods
    public String getGenre() {return genre;}
    public int getDuration() {return durationMinutes;}
    public double getRating() { return rating;}

    public boolean isLongMovie() {return durationMinutes>150;}
    public void displayInfo(){
        System.out.println(getShowName()+ "(" + genre+","+durationMinutes+"min");
        System.out.println("Starring: " + getActName() + " & " + getActressName());
        System.out.println("Running costs: " + getMaintenanceCost() + "; Ratings: " + getRating());
        System.out.println("Primary Support for stunts and shooting are: " + getCameraMan() + " and " + getStuntDirector());
    }



}
