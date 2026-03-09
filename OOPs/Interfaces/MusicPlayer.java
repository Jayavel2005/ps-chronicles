package OOPs.Interfaces;

public class MusicPlayer implements Playable{
    String music;
    MusicPlayer(String music){
        this.music = music;
    }
    @Override
    public void play(){
        System.out.println("Playing Music: " + music);
    }
}
