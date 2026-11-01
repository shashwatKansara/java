package shows;

public class showCasts {
    private String actName;
    private String actressName;
    private String camMan;
    private String stuntDirec;
    private String showName;
    private int maintCost;

    public showCasts() {
        setShowName(showName);
        setActName(actName);
        setActressName(actressName);
    }
    // all the 'set' methods (encapsulation)
    public void setActName(String actor){ this.actName = actor;}
    public void setActressName(String actress) { this.actressName = actress;}
    public void setCameraMan(String cameraMan) { this.camMan = cameraMan; }
    public void setDirector(String SDirector) { this.stuntDirec = SDirector; }
    public void setShowName( String show ) { this.showName = show; }


    public void setMaintenanceCost( int Cost) {
        if (maintCost < 0) throw new IllegalArgumentException("Cost cannot be negative!");
        this.maintCost = Cost;
    }

    // all the public access 'get' methods
    public String getActName() { return actName;}
    public String getActressName() { return actressName;}
    public String getCameraMan() { return camMan; }
    public String getStuntDirector() { return stuntDirec; }
    public String getShowName() { return showName;}
    public int getMaintenanceCost() { return maintCost; }

}
