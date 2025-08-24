interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    public void takePhoto() {
        System.out.println("Photo taken.");
    }

    public void playMusic() {
        System.out.println("Music playing.");
    }
}

public class Program4_MultipleInterfaces {
    public static void main(String[] args) {
        try {
            Smartphone phone = new Smartphone();
            phone.takePhoto();
            phone.playMusic();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
