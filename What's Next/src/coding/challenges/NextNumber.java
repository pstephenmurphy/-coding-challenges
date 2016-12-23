package coding.challenges;

import java.math.BigInteger;
import java.util.ArrayList;

class NextNumber {

    public BigInteger[] nextNumber(BigInteger[] binary) {
        ArrayList<BigInteger> result = new ArrayList<>();
        BigInteger[] dataToProcess;
        //1110000
        if (binary.length % 2 == 0) {
            for (int i = 0; i < binary.length - 2; i++) {
                result.add(binary[i]);
            }
            dataToProcess = new BigInteger[2];
            dataToProcess[0] = binary[binary.length - 1];
            dataToProcess[1] = binary[binary.length - 2];
        //1111
        } else {
            for (int i = 0; i < binary.length - 1; i++) {
                result.add(binary[i]);
            }
            dataToProcess = new BigInteger[1];
            dataToProcess[0] = binary[binary.length - 1];
        }

        BigInteger[] secondPart = process(dataToProcess);
        if (result.size() > 0) {
            result.set(result.size() - 1, result.get(result.size() - 1).subtract(new BigInteger("1")));
        }
        for (int i = 0; i < secondPart.length; i++) {
            result.add(secondPart[i]);
        }
        result = removeZeros(result);
        BigInteger[] ret = new BigInteger[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ret[i] = result.get(i);
        }
        return ret;
    }

    private ArrayList<BigInteger> removeZeros(ArrayList<BigInteger> result) {
        while (result.stream().anyMatch(x -> x.equals(new BigInteger("0")))) {
            int itemToRemove = -1;
            for (int i = 0; i < result.size(); i++) {
                if (result.get(i).equals(new BigInteger("0"))) {
                    itemToRemove = i;
                }
            }
            if (itemToRemove >= 0) {
                result.set(itemToRemove - 1, result.get(itemToRemove - 1).add(result.get(itemToRemove + 1)));
                result.remove(itemToRemove);
                result.remove(itemToRemove);
            }
        }
        return result;
    }

    public BigInteger[] process(BigInteger[] data) {
        BigInteger onesCount;
        BigInteger zerosCount;
        if (data.length == 2) {
            onesCount = data[1];
            zerosCount = data[0];
        } else {
            onesCount = data[0];
            zerosCount = new BigInteger("0");
        }
        ArrayList<BigInteger> resultData = new ArrayList<>();
        resultData.add(new BigInteger("1"));
        onesCount = onesCount.subtract(new BigInteger("1"));

        if (zerosCount.compareTo(new BigInteger("0")) > 0) {
            resultData.add(zerosCount.add(new BigInteger("1")));
        } else {
            resultData.add(new BigInteger("1"));
        }

        if (onesCount.compareTo(new BigInteger("0")) > 0) {
            resultData.add(onesCount);
        }
        BigInteger[] result = new BigInteger[resultData.size()];
        for (int i = 0; i < resultData.size(); i++) {
            result[i] = resultData.get(i);
        }
        return result;
    }
}