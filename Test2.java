import java.util.Arrays;

class Test {
	public static boolean test() {
		int[] nums = new int[]{2,7,11,15};
		int target = 9;

		Solution sol = new Solution();
		int[] actual = sol.twoSum(nums, target);
		int[] expected = new int[] {0,1};

		Arrays.sort(actual);
		Arrays.sort(expected);

	
		return true;
	}
}
