package uvsq.pglp_4_1;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	int numeroTel=356;
        //System.out.println( "Hello World!" );
    	Personnel p1=new Personnel.Builder("amirouche", "amine", LocalDate.now()).AddTel(numeroTel).build();
    	Personnel p2=new Personnel.Builder("amirouche","nassim",LocalDate.now()).build();
    	System.out.println(p1.GetTel());
    	p1.print();
    	p2.print();
    }
}
