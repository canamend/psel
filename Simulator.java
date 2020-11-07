import java.util.ArrayList;

public class Simulator{
    private int time;
    private ArrayList<Process> processes;
    private ArrayList<Results> results;
    private Runable algorithm;

    public Simulator(ArrayList<Process> processes){
        this.processes = processes;
        time = 0;
        results = null;
        algorith = null;
    }

    public void orderProcessByArriveTime(){
        Process min,tmp;
        for(int i = 0; i < processes.size(); i++){
            min = processes.elementAt(i);
            for(int j = i+1; j < processes.size(); j++){
                tmp = processes.elementAt(i);
                if(tmp.getArriveTime() < min.getArriveTime()){
                    min = tmp;
                }
            }
        }
    }
}
