	public static List<Integer> serviceLane(int n, List<List<Integer>> cases) {
		List<Integer> maxSize = new ArrayList<Integer>();

		for (int i = 1; i < cases.size(); i++) {

			int start = cases.get(i).get(0);
			int end = cases.get(i).get(1);

			int min = Integer.MAX_VALUE;
			for (int s = start; s <= end; s++) {
				if (cases.get(0).get(s) < min)
					min = cases.get(0).get(s);
			}
			maxSize.add(min);
		}
		return maxSize;
	}
