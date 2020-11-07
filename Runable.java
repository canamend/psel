import java.util.ArrayList;

public abstract class Runable{
    private Process current;
    private Simulator simulator;

    private Runable();
    public ArrayList<Results> run();
    public void queue(Process process);
}
