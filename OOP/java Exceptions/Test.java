public class Test{
	public static void main(String args[]){
		try{
			int[] myNumbers={1,2,3};
			System.out.println(myNumbers[4]);
		}catch(Exception e){
			System.out.println("Somthing went wrong.");
		}/*finally{
			System.out.println("The 'try catch' is finished.");	
		}*/
		
		try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("can't divided");
        } finally {
            System.out.println("cant't run but run");
        }
		
	}
}