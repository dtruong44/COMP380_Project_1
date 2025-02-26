import java.util.ArrayList;

public class NeuralNet {

    public static void main(String[] args){
        ////FileParser.parseFile();

        //initialize weights
        int n = 63;
        int patterns = 7;
        int fillerA = 1;
        ArrayList<int[]> netNotIncludingB = new ArrayList<>();
        int[] weightB = {0, 0, 0, 0, 0, 0, 0};
        for (int i = 0; i < patterns; i++){
            int[] currentList = new int[n];
            netNotIncludingB.add(currentList);
            for (int j = 0; j < n; j++){
                netNotIncludingB.get(i)[j] = 0;
            }
        }

        boolean converged = false;
        int[] x = new int[n];
        int[] t = new int[patterns];
        int[] yIn = {0, 0, 0, 0, 0, 0, 0};
        int[] yOut = {0, 0, 0, 0, 0, 0, 0};
        while (!converged){
            for (DataSample sample : FileParser.dataset) {
                x = sample.getPixelArray();
                t = sample.getOutputVector();

                for (int i = 0; i < patterns; i++) {
                    yIn[i] += weightB[i];
                    for (int j = 0; j < n; j++) {
                        yIn[i] += x[j] * netNotIncludingB.get(i)[j];
                    }
                    if (yIn[i] > 0){
                        yOut[i] = 1;
                    }
                    else{
                        yOut[i] = -1;
                    }
                    if (yOut[i] != t[i]) {
                        for (int j = 0; j < 0; j++){
                            netNotIncludingB.get(i)[j] = netNotIncludingB.get(i)[j] + fillerA * t[j] * x[i];
                            weightB[j] = weightB[j] + fillerA * t[j];
                        }

                    }
                }
            }
        }

        
        UserIO.welcomeToPerceptron();
    }
}
