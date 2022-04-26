/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reader.criteria;

/**
 *
 * @author junen
 */
public class Not implements Criterion{
   
    private Criterion criteria1;

    public Not(Criterion criteria1){
        this.criteria1 = criteria1;
    }

    @Override
    public boolean complies(String line) {
        return !criteria1.complies(line);
        
    }
}
