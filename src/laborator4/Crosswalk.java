package laborator4;

public class Crosswalk {
    private String location;
    private Boolean state; // 0 - nu e nimeni pe trecere , 1 - trecerea e ocupata

    public Crosswalk(String location,  Boolean state) {
        this.location = location;
        this.state = state;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    public boolean isState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
