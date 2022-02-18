	public static int minimumDistances(List<Integer> a) {
		int min = Integer.MAX_VALUE;
		HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> second = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.size(); i++) {

			if (first.containsKey(a.get(i))) {
				second.put(a.get(i), i);

			} else {
				first.put(a.get(i), i);
			}

		}

		for (int key : second.keySet()) {
			int distance = second.get(key) - first.get(key);
			if (distance < min)
				min = distance;

		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}
