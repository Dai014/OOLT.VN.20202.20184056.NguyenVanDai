package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {
    protected String director;
    protected int length;

    public Disc() {

    }


    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public int getLength() {
        return length;
    }

    public Disc(String director, int length) {
        this.director = director;
        this.length = length;
    }

    public Disc(int id,String title,String category,float cost,String director) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.director = director;
    }

    public Disc(int id,String title,String category,float cost,String director, int length) {
        super.id = id;
        super.title = title;
        super.category = category;
        super.cost = cost;
        this.director = director;
        this.length = length;
    }

    @Override
    public String showInfo() {
        return "Disc.ID: " + getId() + "- Title: " + getTitle() + ", Category: " + getCategory() + ", Director: " + getDirector() + ", Length: " + getLength() + ", Price: "+ getCost();
    }
}
