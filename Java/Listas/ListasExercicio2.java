package fundamentos;

public class ListasExercicio2 {

	public static void main(String[] args) {
		int[] ArrayNum = {87,68,52,5,49,83,45,12,64};
		int total = 0;
		//ADICIONA O VALOR DE CADA ELEMENTO AO TOTAL
		for(int x : ArrayNum)
			total+=x;
		System.out.printf("Total da soma de elementos no ArrayNum: %d \n",total);

	}

}
