package _05_class._interface._02;

// 전화 기능을 위한 인터페이스
interface Phone {
    void makeCall(String number);
    void answerCall();
}

// 인터넷 기능을 위한 인터페이스
interface InternetDevice {
    void browseWeb(String url);
    void sendEmail(String address, String content);
}

// 카메라 기능을 위한 인터페이스
interface Camera {
    void takePhoto();
    void recordVideo();
}

// 다중 인터페이스를 구현
// - 구현 객체 (SmartPhone)는 여러 개의 인터페이스를 구현 (implements) 할 수 있음
class SmartPhone implements Phone, InternetDevice, Camera {
    @Override
    public void answerCall() {
        System.out.println("전화를 받습니다.");
    }

    @Override
    public void makeCall(String number) {
        System.out.println(number + "로 전화를 받습니다.");
    }

    @Override
    public void sendEmail(String address, String content) {
        System.out.println(address + "로 이메일을 보냅니다: " + content);
    }

    @Override
    public void browseWeb(String url) {
        System.out.println(url + "에 접속합니다.");
    }

    @Override
    public void recordVideo() {
        System.out.println("동영상을 촬영합니다.");
    }

    @Override
    public void takePhoto() {
        System.out.println("사진을 찍습니다.");
    }
}

public class InterfaceEx04 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();

        // 전화기 기능 사용
        sp.makeCall("010-1234-1234");
        sp.answerCall();

        // 인터넷 기기 기능 사용
        sp.browseWeb("www.naver.com");
        sp.sendEmail("test@naver.com", "안뇽");

        // 카메라 기능 사용
        sp.takePhoto();
        sp.recordVideo();
    }
}