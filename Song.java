package ansika_package;

public class Song {
    String title;
    double duration;
    public Song(String name,double duration){
        this.title = name;
        this.duration = duration;
    }
    public Song(){

    }
    public double getDuration() {
        return duration;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

}
