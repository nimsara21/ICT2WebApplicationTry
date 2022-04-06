package lk.iit.ict.ict2webapplicationtry;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.ArrayList;
import java.util.Collections;


@WebService
public class ICT2WebService {

    ArrayList<Double> myArray = new ArrayList<>();

    @WebMethod
    public Integer isConnected() {
        System.out.println("[SERVER] - Connection is being Tested.");
        return 0;
    }

    @WebMethod
    public Double safeDivide(Double x, Double y) throws Exception {
        System.out.println("[SERVER] - Dividing " + x + " by " + y);
        if (x == null) {
            throw new Exception("Parameter x cannot be null.");
        }
        if (y == null) {
            throw new Exception("Parameter y cannot be null.");
        }
        if (y == 0) {
            throw new Exception("Parameter y cannot be zero.");
        }
        Double z = x / y;
        System.out.println("[SERVER] - Sending " + z);
        return z;
    }

    @WebMethod
    public Double divide(Double x, Double y) {
        System.out.println("[SERVER] - Dividing " + x + " by " + y);
        Double z = x / y;
        System.out.println("[SERVER] - Sending " + z);

        return z;
    }

    @WebMethod
    public void addDoubleOnServer(Double v) throws Exception {
        System.out.println("[SERVER] - Adding "+ v + " to the ArrayList.");
        if (v == null){
            throw new Exception("Parameter v cannot be null.");
        }
        myArray.add(v);

        System.out.println("[SERVER] - Successfully added "+ v + " to the ArrayList.");

    }

    @WebMethod
    public Double getLargestDoubleOnServer() {
        Collections.sort(myArray);
        Double largestNum = Collections.max(myArray);
        return largestNum;
    }

    @WebMethod
    public Integer amoamo() {
        return 1;
    }

}
