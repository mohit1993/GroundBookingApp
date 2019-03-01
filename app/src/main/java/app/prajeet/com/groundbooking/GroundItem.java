package app.prajeet.com.groundbooking;

public class GroundItem {
    private int mGroundImage;
    private int mGroundName;
    private int mGroundRent;
    private int mGroundCity;
    private int mGroundDistance;
    private int mGroundBook;

    public GroundItem(int mGroundImage, int mGroundName, int mGroundRent, int mGroundCity, int mGroundDistance, int mGroundBook) {
        this.mGroundImage = mGroundImage;
        this.mGroundName = mGroundName;
        this.mGroundRent = mGroundRent;
        this.mGroundCity = mGroundCity;
        this.mGroundDistance = mGroundDistance;
        this.mGroundBook = mGroundBook;
    }

    public int getGroundImage() {
        return mGroundImage;
    }

    public void setGroundImage(int mGroundImage) {
        this.mGroundImage = mGroundImage;
    }

    public int getGroundName() {
        return mGroundName;
    }

    public void setGroundName(int mGroundName) {
        this.mGroundName = mGroundName;
    }

    public int getGroundRent() {
        return mGroundRent;
    }

    public void setGroundRent(int mGroundRent) {
        this.mGroundRent = mGroundRent;
    }

    public int getGroundCity() {
        return mGroundCity;
    }

    public void setGroundCity(int mGroundCity) {
        this.mGroundCity = mGroundCity;
    }

    public int getGroundDistance() {
        return mGroundDistance;
    }

    public void setGroundDistance(int mGroundDistance) {
        this.mGroundDistance = mGroundDistance;
    }

    public int getGroundBook() {
        return mGroundBook;
    }

    public void setGroundBook(int mGroundBook) {
        this.mGroundBook = mGroundBook;
    }
}
