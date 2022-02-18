//method		
public static int beautifulDays(int i, int j, int k) {
			int count = 0;

			for (; i <= j; i++) {

				int diff = Math.abs(i - reverse(i));

				if (diff % k == 0)
					count++;
			}
			return count;
		}
