/**
 * 
 */

/**
 * @author danielfiuza
 *
 */
public class Fibonacci {

	/**
	 * 
	 */
	public Fibonacci() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int anterior = 1;
//		int proximo  = 2;
//		
//		while(proximo < 50) {
//			System.out.println(proximo);
//			proximo  = proximo + anterior;
//			anterior = proximo - anterior;
//		}

		/**
		 * LABEL BREAK TESTE
		 */
		boolean[][] matrix = {
				{false,true,false,false,false},
				{false,false,false,false,false}
		};
		busca:
		for(int i = 0; i < matrix.length;i++) {
			System.out.println("A ");
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j]) {
					System.out.println("TRUE ");
					break busca;
				}
			}
			System.out.println("B ");
			
		}
	}

}
