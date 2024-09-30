public class CinemaConfig {
    private static CinemaConfig instance;
    private String cinemaName;

    private CinemaConfig() { }

    public static CinemaConfig getInstance() {
        if (instance == null) {
            instance = new CinemaConfig();
        }
        return instance;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public String getCinemaName() {
        return cinemaName;
    }
}


