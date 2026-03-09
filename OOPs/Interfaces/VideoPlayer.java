package OOPs.Interfaces;

public class VideoPlayer implements Playable {
    String video;

    VideoPlayer(String video) {
        this.video = video;

    }

    @Override
    public void play() {
        System.out.println("Playing video" + video);
    }
}
