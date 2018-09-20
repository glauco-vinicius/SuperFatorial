import java.math.BigInteger;

/*
 * SuperFatorial usando BigInteger não recursivo
 */
public class SuperFactorial {
	
	public  BigInteger getSuperFatorial(BigInteger n){
        BigInteger superFact = BigInteger.ONE;
        if( n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) 
        	      return BigInteger.ONE;
        for(BigInteger i = n; i.compareTo(BigInteger.ONE) == 1 ; i = i.subtract(BigInteger.ONE)){
        	    System.out.println(n.toString() + "! ->"+ superFact.toString() + "( " + i.toString() + ") ");
            superFact = superFact.multiply( factorial(i) );
        }
        System.out.println("fim");
        return superFact;
    }
	
    private BigInteger factorial(BigInteger n){
        BigInteger fact = BigInteger.ONE;
        if( n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) 
        		return BigInteger.ONE;
        for(BigInteger i = n; i.compareTo(BigInteger.ONE) == 1; i = i.subtract(BigInteger.ONE)){
           	System.out.println(n.toString() + "! ->"+ fact.toString() + "( " + i.toString() + ") ");
            fact = fact.multiply(i);
        }
        System.out.println("saindo");
        return fact;
    }
    
}
