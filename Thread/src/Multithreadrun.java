class Threadrun implements Runnable
{

  public void run( )
  {
    for( int i = 1 ; i < 6 ; i++ )
 System.out.println( " Hello India " + i ) ;
  }
}

public class Multithreadrun
{
  public static void main( String[ ] args )
  {
	  Threadrun r = new Threadrun( ) ;
    Thread t = new Thread( r ) ;
    System.out.println( t ) ; 

    t.start( ) ;
  } 
}
