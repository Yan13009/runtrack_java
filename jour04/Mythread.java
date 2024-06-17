public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Mon thread est en cours");
    }
}
public class ThreadProject {
    public static void main(String[] args) {
        // Instanciation de la classe MyThread
        MyThread myThread = new MyThread();
        
        // Lancement de l'exécution du thread
        myThread.start();
    }
}
