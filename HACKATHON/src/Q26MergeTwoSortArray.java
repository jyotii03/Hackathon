
public class Q26MergeTwoSortArray {

	
		final static int INVALID_NUM = 0;

		public void inplaceMergeArrays(int[] arrayA, int[] arrayB) {

			int validNumIndex = arrayA.length - 1;
			for (int i = arrayA.length - 1; i >= 0; i--) {
				if (arrayA[i] != INVALID_NUM) {
					arrayA[validNumIndex] = arrayA[i];
					validNumIndex -= 1;
				}
			}

			int i = validNumIndex + 1;
			int j = 0, k = 0;

			while ((i < arrayA.length) && (j < arrayB.length)) {
				if (arrayA[i] < arrayB[j]) {
					arrayA[k++] = arrayA[i++];
				} else {
					arrayA[k++] = arrayB[j++];
				}
			}

			while (j < arrayB.length) {
				arrayA[k++] = arrayB[j++];
			}
		}
	

	public static void main(String[] args) {

		Q26MergeTwoSortArray solution = new Q26MergeTwoSortArray();

		int[] arrayA = new int[10];
		arrayA[0] = 1;
		arrayA[1] = 2;
		arrayA[2] = 4;
		arrayA[3] = 6;
		arrayA[4] = 9;
		arrayA[5] = 10;
		int[] arrayB = { 3, 5, 7, 8 };

		solution.inplaceMergeArrays(arrayA, arrayB);
		System.out.println("Array after merging elements ");
		for (int i = 0; i < arrayA.length; i++) {
			System.out.print(arrayA[i] + ", ");
		}
	}

}
