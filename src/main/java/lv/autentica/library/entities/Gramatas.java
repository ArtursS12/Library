package lv.autentica.library.entities;

public class Books {

    private String Name;
    private String Author ;
    private Integer ReleaseYear;
    private String Publisher;

    public Books(String name, String author, Integer releaseYear, String publisher) {
        Name = name;
        Author = author;
        ReleaseYear = releaseYear;
        Publisher = publisher;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Integer getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    @Override
    public String toString() {
        return "Books{" +
                "Name='" + Name + '\'' +
                ", Author='" + Author + '\'' +
                ", ReleaseYear=" + ReleaseYear +
                ", Publisher='" + Publisher + '\'' +
                '}';
    }
}
