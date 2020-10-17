import java.util.ArrayList;

public class Table{
    private ArrayList<DataTable> dataTable;
    private double averageOutput;
    private double averageResponse;
    private double averageWaste;
    private double averagePenalty;
    private double averageWait;
    private int totalOutput;
    private int totalResponse;
    private int totalWaste;
    private double totalPenalty;
    private int totalWait;

    public Table(ArrayList<DataTable> data){
        this.dataTable = dataTable;
        averageOutput = 0;
        averageResponse = 0;
        averageWaste = 0;
        averagePenalty = 0;
        averageWait = 0;
        totalOutput = 0;
        totalResponse = 0;
        totalWaste = 0;
        totalPenalty = 0;
        totalWait = 0;
    }

    public double getAverageOutput(){
        return averageOutput;
    }

    public double getAverageResponse(){
        return averageResponse;
    }

    public double getAverageWaste(){
        return averageWaste;
    }

    public double getAveragePenalty(){
        return averagePenalty;
    }

    public double getAverageWait(){
        return averageWait;
    }

    public int getTotalOutput(){
        return totalOutput;
    }

    public int getTotalResponse(){
        return totalResponse;
    }

    public int getTotalWaste(){
        return totalWaste;
    }

    public double getTotalPenalty(){
        return totalPenalty;
    }

    public int getTotalWait(){
        return totalWait;
    }

    public void calculateTotal(){
        for(int i = 0; i < dataTable.size(); i++){
            totalOutput += dataTable.elementAt(i).getOutput();
            totalResponse += dataTable.elementAt(i).getResponse();
            totalWaste += dataTable.elementAt(i).getWaste();
            totalPenalty += dataTable.elementAt(i).getPenalty();
            totalWait += dataTable.elementAt(i).getWait();
        }
    }

    public void calculateAverage(){
        averageOutput = totalOutput/dataTable.size();
        averageResponse = totalResponse/dataTable.size();
        averageWaste = totalWaste/dataTable.size();
        averagePenalty = totalPenalty/dataTable.size();
        averageWait = totalWait/dataTable.size();
    }

    public void reset(){
        averageOutput = 0;
        averageResponse = 0;
        averageWaste = 0;
        averagePenalty = 0;
        averageWait = 0;
        totalOutput = 0;
        totalResponse = 0;
        totalWaste = 0;
        totalPenalty = 0;
        totalWait = 0;
    }
}
