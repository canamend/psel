public class DataTable{
    private Process process;
    private int startTime;
    private int endTime;
    private int output;
    private int response;
    private int waste;
    private double penalty;
    private int wait;

    public DataTable(Process process){
        this.process = process;
        startTime = 0;
        endTime = 0;
        output = 0;
        response = 0;
        waste = 0;
        penalty = 0;
        wait = 0;
    }

    public Process getProcess(){
        return process;
    }

    public int getStartTime(){
        return startTime;
    }
    
    public int getEndTime(){
        return endTime;
    }

    public int getOutput(){
        return output;
    }

    public int getResponse(){
        return response;
    }

    public int getWaste(){
        return waste;
    }

    public double getPenalty(){
        return penalty;
    }

    public int getWait(){
        return wait;
    }

    public void setStartTime(int startTime){
        this.startTime = startTime;
    }

    public void setEndTime(int endTime){
        this.endTime = endTime;
    }

    public void calculateOutput(){
        output = endTime - startTime;
    }

    public void calculateResponse(){
        response = endTime - process.getArriveTime();
    }

    public void calculateWaste(){
        waste = response - process.getCpuTime();
    }

    public void calculatePenalty(){
        penalty = response/process.getCpuTime();
    }

    public void calulateWait(){
        wait = startTime - process.getArriveTime();
    }
}
