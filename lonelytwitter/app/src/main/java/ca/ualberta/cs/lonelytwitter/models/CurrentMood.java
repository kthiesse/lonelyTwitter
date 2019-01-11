package ca.ualberta.cs.lonelytwitter.models;

public abstract class CurrentMood {
    private string date;
    public string line_response;

    public string getDate() {
        return date;
    }

    public void setDate(string date) {
        this.date = date;
    }
}
