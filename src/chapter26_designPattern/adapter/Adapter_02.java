package chapter26_designPattern.adapter;

/**
 * ===========================================================
 * fileName       : Adapter_02
 * date           : 2024-02-17
 * description    :
 * 어댑터 디자인 패턴의 예시로, 상이한 두 개의 시스템 사이에서 데이터를 교환하기 위한 인터페이스를 제공하는 시나리오를 생각해볼 수 있습니다. 이 예에서는 간단한 미디어 플레이어 인터페이스와 그 인터페이스를 통해 다양한 형태의 미디어 파일을 재생하는 어댑터를 구현합니다.
 * 시나리오
 * <p>
 * 타겟 인터페이스(Target Interface): MediaPlayer 인터페이스는 play 메서드를 가지며,
 * 이 메서드는 파일 타입과 파일 이름을 인자로 받습니다.
 * 어댑티(Adaptee): AdvancedMediaPlayer 인터페이스는 더 전문화된 미디어 플레이어로,
 * playVlc와 playMp4 메서드를 제공합니다. VlcPlayer와 Mp4Player 클래스는 이 인터페이스를 구현합니다.
 * 어댑터(Adapter): MediaAdapter 클래스는 MediaPlayer 인터페이스를 구현하며,
 * 생성자에서 주어진 파일 타입에 따라 적절한 AdvancedMediaPlayer 인스턴스(VlcPlayer 또는 Mp4Player)를 초기화하고,
 * play 메서드에서는 해당 인스턴스의 playVlc 또는 playMp4를 호출합니다.
 * ===========================================================
 */


// 타겟 인터페이스
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// 어댑티 인터페이스
interface AdvancedMediaPlayer {
    void playVlc(String fileName);

    void playMp4(String fileName);
}

// 어댑티 구현체 1
class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}

// 어댑티 구현체 2
class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

// 어댑터
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

// 클라이언트
class AudioPlayer implements MediaPlayer {
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {

        // 기본적인 mp3 지원
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        // mediaAdapter를 통해 더 많은 포맷 지원
        else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}

public class Adapter_02 {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}
/*
        이 예시에서 `AudioPlayer` 클래스는 타겟 인터페이스(`MediaPlayer`)
        를 구현하며, 내부적으로 `MediaAdapter`를 사용하여 MP3 이외의 다른 형태의 미디어 파일(`vlc` 또는 `mp4`)을 재생할 수 있습니다. 어댑터 패턴을 통해 `AudioPlayer`는 기존의 코드를 변경하지 않고도 새로운 미디어 형식을 지원할 수 있게 됩니다.

 */

