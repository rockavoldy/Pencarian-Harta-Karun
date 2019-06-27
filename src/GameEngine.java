public class GameEngine {
    public static void main(String[] args) {
        GameEngine ge = new GameEngine();
        ge.mulai();
    }

    public GameEngine() {
        ThreadGUI gameThread = new ThreadGUI();
        gameThread.start();
    }

    private void mulai() {
        System.out.println("Permainan dimulai !");
    }
}
