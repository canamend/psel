public class Process{
    private int id;
    private int cpuTime;
    private int remainingTime;
    private int priority;
    private int arriveTime;
    private boolean active;

    public Process(int id, int cpuTime, int priority, int arriveTime){
        this.id = id;
        this.cpuTime = cpuTime;
        this.priority = priority;
        this.arriveTime = arriveTime;
        remainingTime = cpuTime;
        active = false;
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

    public void activate(){
        active = true;
    }

    public void reset(){
        remainingTime = cpuTime;
        active = false;
    }

    public boolean isActive(){
        return active;
    }
}
