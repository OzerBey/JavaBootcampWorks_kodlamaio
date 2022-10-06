package week3_homework.example1;

public class ReferenceType implements IShowType {

	@Override
	public void show() {
		int nums1[] = { 1, 2, 3 }; // declare nums1 array's value in heap
		int nums2[] = { 10, 20, 30 };
		nums1 = nums2; // hold on reference value of nums2 array in heap

		nums2[0] = 100; // assignment nums2 array's 1st item = 100
		System.err.println("The value of nums1 array's 1st index :" + nums1[0]);
	}
}
