import java.util.ArrayList;
import java.time.Year;

public class ContentDemo {

    public static void main(String[] args) {

        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("our 1th java project", 2025, 45, "Full HD"));
        items.add(new VideoLecture("Advanced Js", 2025, 90, "4K"));

        items.add(new PodcastEpisode("Tech Talks", 2023, 45, "Ali"));
        items.add(new PodcastEpisode("Coding Life", 2021, 60, "Sara"));

        int currentYear = Year.now().getValue();

        for (ContentItem item : items) {
            System.out.println(item);
            System.out.println("License Cost = " +
                    item.getLicenseCost(currentYear));

            if (item instanceof Downloadable) {
                Downloadable d = (Downloadable) item;
                d.download();
                System.out.println("Max downloads/day: " +
                        d.getMaxDownloadsPerDay());
            }

            System.out.println("--------------------------------");
        }
    }
}
