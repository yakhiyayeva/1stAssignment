class MovieSchedule implements Cloneable {
    private Movie movie;
    private String time;

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    protected MovieSchedule clone() {
        try {
            return (MovieSchedule) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString() {
        return "Movie: " + (movie != null ? movie.getTitle() : "No Movie") + " at " + time;
    }
}

class StandardSchedule extends MovieSchedule {
    public StandardSchedule() {
        setTime("Default Time");
    }
}

