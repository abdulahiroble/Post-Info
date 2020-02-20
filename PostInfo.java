/**
 * PostInfo
 */
public class PostInfo {
    private int PostNummer;
    private String By;

    public int getPostNummer() {
        return PostNummer;
    }

    public PostInfo(int PostNummer, String By) {
        this.PostNummer = PostNummer;
        this.By = By;
    }

    @Override
    public String toString() {
        return "Postnummer: " + PostNummer + " " + "By: " + By;
    }

}