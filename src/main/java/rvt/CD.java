package rvt;

public class CD implements Packable {

    private String artist;
    private String cdname;   
    private int year;
    
    public CD(String artist, String cdname, int year ) {
        this.artist = artist;
        this.cdname = cdname;
        this.year = year;
    }

    @Override
    public double weight() {
        return 0.1;
    }
    public String toString() {
        return this.artist + "; " + this.cdname + "; " + "(" + this.year + ")";
    }
}
