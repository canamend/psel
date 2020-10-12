public class Process{
    private int id;
    private int cpuTime;
    private int remainingTime;
    private int priority;
    private int arriveTime;

    public Process(int id, int cpuTime, int priority, int arriveTime){
        this.id = id;
        this.cpuTime = cpuTime;
        this.priority = priority;
        this.arriveTime = arriveTime;
        remainingTime = cpuTime;
    }

    public int getId(){
        return id;
    }

    public int getcpuTime(){
        return cpuTime;
    }
    
    public int getPriority(){
        return priority;
    }
    
    public int getRemainingTime(){
        return executeTime;
    }

    public void execute(){
        remainingTime--;
    }

    public void reset(){
        remainingTime = cpuTime;
    }
}
