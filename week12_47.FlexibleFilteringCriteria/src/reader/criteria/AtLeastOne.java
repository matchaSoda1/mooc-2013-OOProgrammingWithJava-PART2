/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author junen
 */
public class AtLeastOne implements Criterion{
    private Criterion[] criteria;
    
    public AtLeastOne(Criterion... criteria){
        this.criteria = criteria;
    }

    @Override
    public boolean complies(String line) {
        boolean complies = this.criteria[0].complies(line);
        
        for (Criterion criteria: this.criteria){
            complies = complies || criteria.complies(line);
        }
        return complies;
    }
    
    
}
