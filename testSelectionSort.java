import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
		testPositive();
		testNegative();
		testMixed();
		testDuplicates();
	}

    public testSelectionSort() {
    }

    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;

        SelectionSort temparr = new SelectionSort();
        arr = temparr.basicSelectionSort(arr);

        for(int i = 0; i < 5; i++) {
        assertTrue("Wrong testPositive()" + i, arr[i] == Sortedarr[i]);
        }
        /** add tests to check for this unit test **/
    }

    public void testNegative(){
        int[] arr = new int[5];
        arr[0] =-2;
        arr[1] = -1;
        arr[2] = -5;
        arr[3] = -3;
        arr[4] = -4;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -5;
        Sortedarr[1] = -4;
        Sortedarr[2] = -3;
        Sortedarr[3] = -2;
        Sortedarr[4] = -1;
        /** Test data contains negative values only **/
        SelectionSort temparr = new SelectionSort();
        arr = temparr.basicSelectionSort(arr);

        for(int i = 0; i < 5; i++) {
            assertTrue("Wrong testPositive()" + i, arr[i] == Sortedarr[i]);
            }
    }

    public void testMixed(){
        int[] arr = new int[5];
        arr[0] = -3;
        arr[1] = 2;
        arr[2] = 1;
        arr[3] = -1;
        arr[4] = 4;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -3;
        Sortedarr[1] = -1;
        Sortedarr[2] = 1;
        Sortedarr[3] = 2;
        Sortedarr[4] = 4;
        /** Test data contains with both positive, negative and zeros **/
        SelectionSort temparr = new SelectionSort();
        arr = temparr.basicSelectionSort(arr);

        for(int i = 0; i < 5; i++) {
            assertTrue("Wrong testPositive()" + i, arr[i] == Sortedarr[i]);
            }
    }

    public void testDuplicates(){
        int[] arr = new int[5];
        arr[0] = 2;
        arr[1] = 2;
        arr[2] = -4;
        arr[3] = -4;
        arr[4] = 3;

        int[] Sortedarr = new int[5];
        Sortedarr[0] = -4;
        Sortedarr[1] = -4;
        Sortedarr[2] = 2;
        Sortedarr[3] = 2;
        Sortedarr[4] = 3;
        /** Test data contains duplicates **/

        SelectionSort temparr = new SelectionSort();
        arr = temparr.basicSelectionSort(arr);

        for(int i = 0; i < 5; i++) {
            assertTrue("Wrong testPositive()" + i, arr[i] == Sortedarr[i]);
            }
    }


}
