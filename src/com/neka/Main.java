package com.neka;

public class Main {
  /*  two types of stmnt : normal and critical
    normal ex : int i = 9;
    critical : int k=i/j where j might be 0

    exception handling theory :
    ex : opening file that doesn't exist, wrong user input
    exception : as an user/developer, we can handle
    error : we can't do anything ex : jvm running out of memory - all physical error

     //two types of exception :
     //checked - an exception arises and user can handle it/when the complier know knows about it
                    ~IOException
                    ~SQLException
     and
     unchecked - user can't handle any/runtime subclass
               ~Runtime Exception
     we put critical block into try and if the try blow has exception it moves to catch

    try{
    int i = j/k;
    }
    catch(Exception e){

    }

    you can have one try and multiple catch block for each expection.
    for unknown exceptions we have general exception
    EXCEPTION is like a parent class

     throws - passing the exception one step above and making others method to solve it
     also used when you feel it might throw error

     public static void main(String[] args) throws Exception


        */

    public static void main(String[] args) {
	// write your code here
        //uncheckedExp :

       // int i =9/0;  //---> throws expection in run time.
        try{
            //put all the critical stmnt in try block
            //int i = 9/0;

            //example 2
            int a = 14;
            int b = 2;
            int c = a/b;  //--->put this alone in try block
            System.out.println(c); //--->doesn't throw exp; prints 7

            //now,
            int e = 0;
            int d =  15/e;
            System.out.println(e);
            //directly jumps to catch block to show exp

            int arr[] = new int [6];
            arr[6] = 10;              //Out of bound expection
            System.out.println("Out of bound");

        }
//(i.e) if the line throws error it just jumps to catch
        //catch(Exception e){
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
            //you can combine multiple expection using e | provided both should have same error msg
            System.err.println("Error"); //appears in red because of err
        }
//put this at the last, otherwise the rest of catch will have compile time error
//all the error will be handled by this one itself
        catch (Exception e){
            System.out.println("smtng is wrong dude");
        }


        //now if you want to have a stmnt in both try and catch block you put that in finally
        finally{
            System.out.println("To avoid repetition --> code redundancy");
            //gets executed whether you get exception or not
            //close all the i/p in finally
        }
    }
}
/*
Note :
If you have multiple expections the very first expection's catch will be executed

    Also, if you have multiple expections and you are not sure which expection will come, always put the last block as Expection ---> as expection is the superset of all exp
    refer from 37

    throws - supress the error.
    public static void main (String[] args) throws Exception
    public static void main (String[] args) throws IOException,SQLException

    if(k<10){
    throw new ArithmeticException();
    }

    catch(ArithmeticException e){
    sout("value should be greater than 10);

    to create your own exception

    public class myOwnException extends Exception{



    }

 */
