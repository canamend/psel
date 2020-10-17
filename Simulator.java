import java.util.ArrayList;
import java.util.Stack;

public class Simulator{
    private ArrayList<Process> processes;
    private ArrayList<Process> queque;
    private int time;
    private Process current;

    public Simulator(ArrayList<Process> processes){
        this.processes = processes;
        queque = new ArrayList<Process>();
        time = 0;
    }

    public void reset(){
        time = 0;
        for(int i = 0; i < processes.size(); i++){
            processes.elementAt(i).reset();
        }
    }

    public boolean executionFinish(){
        Process tmp;
        for(int i = 0; i < processes.size(); i++){
            tmp = processes.elementAt(i);
            if(tmp.getRemainingTime() != 0) return false;
        }
        return true;
    }

    public boolean processQueque(){
        Process tmp;
        boolean flag = 0;
        for(int i = 0; i < processes.size(); i++){
            tmp = processes.elementAt(i);
            if(tmp.getArriveTime() == time){
                queque.add(tmp);
                flag = true;
            }
        }
        return flag;
    }

    public void findNextSRT(){
        Process tmp;
        for(int i = 0; i < queque.size(); i++){
           tmp = queque.elementAt(i);
            if(tmp.getRemainingTime() != 0 && tmp.getRemainingTime() < current.getRemainingTime())
                current = tmp;
        }
    }

    public void findNextSJ(){
        Process tmp;
        for(int i = 0; i < queque.size(); i++){
            tmp = queque.elementAt(i);
            if(tmp.getRemainingTime() != 0 && tmp.getCpuTime() < current.getCpuTime())
                current = tmp;
        }
    }

    public void findNextPriority(){
        Process tmp;
        for(int i = 0; i < queque.size(); i++){
            tmp = queque.elementAt(i);
            if(tmp.getRemainingTime() != 0 && tmp.getPriority() < current.getPriority())
                current = tmp;
        }
    }

    public ArrayList<DataTable> Fifo(){
        reset();
        ArrayList<DataTable> dataTable = new ArrayList<DataTable>();
        Stack<Process> pila = new Stack<Process>();
        while(!executionFinish()){
        }
    }
}
