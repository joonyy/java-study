package _05_class.Practice3;

interface Music{
    void play(String music);
    void stop(String music);
}
class Mp3Player implements Music{

    public Mp3Player(){
        System.out.println("===MP3 Player===");
    }
    @Override
    public void play(String music) {
        System.out.println("MP3 플레이어에서 '"+music+"'음악을 재생합니다.");
    }

    @Override
    public void stop(String music) {
        System.out.println("MP3 플레이어에서 '"+music+"'음악을 중지합니다.");
    }
}

class CdPlayer implements Music{

    public CdPlayer(){
        System.out.println("===CD Player===");
    }
    @Override
    public void play(String music) {
        System.out.println("CD 플레이어에서 '"+music+"'앨범을 재생합니다.");
    }

    @Override
    public void stop(String music) {
        System.out.println("CD 플레이어에서 '"+music+"'앨범을 중지합니다.");

    }
}

public class Practice3_1{
    public static void main(String[] args) {
        Mp3Player mp3 = new Mp3Player();
        mp3.play("아이유 블루밍");
        mp3.stop("아이유 블루밍");

        System.out.println();
        CdPlayer cd = new CdPlayer();
        cd.play("아이유 꽃갈피");
        cd.stop("아이유 꽃갈피");

    }
}