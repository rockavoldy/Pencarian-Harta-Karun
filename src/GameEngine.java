public class GameEngine {
    private static Player objectPlayer;

    public static void main(String[] args) {
        GameEngine ge = new GameEngine();
        ge.mulai();
    }

    public GameEngine() {
        objectPlayer = new Player();
        ThreadGUI gameThread = new ThreadGUI();
        gameThread.objectPlayer = objectPlayer;
        gameThread.start();
    }

    private void mulai() {
        System.out.println("Permainan dimulai !");
    }
}
