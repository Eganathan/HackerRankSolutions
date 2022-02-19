	public static int chocolateFeast(int n, int c, int m) {
		int cho = n / c, wrap = cho;
		
		while (wrap >= m) {
			cho += wrap / m;
			wrap = wrap / m + wrap % m;

		}

		return cho;
	}
