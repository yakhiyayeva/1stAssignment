abstract class Movie {
    protected String title;
    protected String type;

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }
}

class RegularMovie extends Movie {
    public RegularMovie(String title) {
        this.title = title;
        this.type = "Regular";
    }
}

interface MovieFactory {
    Movie createMovie(String title);
}

class RegularMovieFactory implements MovieFactory {
    @Override
    public Movie createMovie(String title) {
        return new RegularMovie(title);
    }
}

