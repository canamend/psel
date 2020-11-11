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
        algorithm = null;
    }

    public int getTime(){
        return time;
    }

    public void orderProcessByArriveTime(){
        Process min,tmp;
        int i,j;
        for(i = 0; i < processes.size(); i++){
            min = processes.get(i);
            for(j = i+1; j < processes.size(); j++){
                tmp = processes.get(i);
                if(tmp.getArriveTime() < min.getArriveTime()){
                    min = tmp;
                }
            }
            tmp = processes.get(i);
            j = processes.indexOf(min);
            processes[j] = tmp;
            processes[i] = min;
        }
    }

    public void compute(Process process){
        time++;
        process.compute();
    }

    public void start(){
        algorithm.run();
    }

    public void selectAlgorithm(int option){
        switch(option){
            case 1:
                algorithm = new FCFC(this);
                break;
            case 2:
                algorithm = new SJF(this);
                break;
            case 3:
                algorithm = new SRT(this);
                break;
            case 4:
                algorithm = new RoundRobin(this);
                break;
            case 5:
                algorithm = new Priority(this);
                break;
            case default:
                algorithm = null;
                break;
        }
    }
}
