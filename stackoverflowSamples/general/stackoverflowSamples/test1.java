package stackoverflowSamples;

public class test1 {
    	
    public static void main(String[] args) {

        String cad = "*";
        int numero = 4; //*|*1|*12|*123|*1234
        int counter = 1;
        while (counter<=numero) { 
            cad += "|*";
	        for (int i = 1; i <= counter; i++ ){
	            cad += i; 
	        } 
	        counter++;
	        System.out.println(cad);
        }

    }
}
