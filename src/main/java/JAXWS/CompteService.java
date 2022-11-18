package JAXWS;

import entities.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class CompteService {
    @WebMethod(operationName = "Convert")
    public double Conversion(@WebParam(name = "montant") double mt){
        return mt*10.25;
    }
    @WebMethod
    public Compte getCompte(Integer code){
        return new Compte(code,Math.random()*98546,new Date());
    }

    public List<Compte> ListeComptes(){
        return List.of(
                new Compte(1,Math.random()*98546,new Date()),
                new Compte(2,Math.random()*5895,new Date()),
                new Compte(3,Math.random()*4236,new Date())

        );

    }
}
