package day3.topic3_exceptions;

public class Ex06Exceptions {
    public static void main(String[] args) {

//        System.out.println("Hi".charAt(10));

        try{
            System.out.println("Hi".charAt(10));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        System.out.println("AFTER TRY CATCH\n--------------------------------");

        try {
            int[] arr = {3, 4, 1, 4};
            System.out.println(arr[100]);
        }catch (StringIndexOutOfBoundsException | ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        /*
           or multiple separate blocks
            }catch (StringIndexOutOfBoundsException e){
                e.printStackTrace();
            }catch (ArrayIndexOutOfBoundsException e){

            ------------------------------------------

           or using inheritance and polymorphism
            }catch (IndexOutOfBounds e){

         */

        /*
            When there is multiple catch blocks they should be ordered to handle the more specific exceptions first

            } catch(IndexOutOfBoundsException e) {
            } catch(RuntimeException e) {
            } catch(Exception e) {

            the wrong order will prevent the program from compiling
         */

        System.out.println("--------------------------------");

        try{
            System.out.println(5/0);
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("FINALLY block running");
        }

    }
}
