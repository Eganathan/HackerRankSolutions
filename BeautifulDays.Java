//blog post : https://tekanath.blogspot.com/2022/02/chocolate-feast-problem-solving-hacker.html
//Method Block
	public static int chocolateFeast(int n, int c, int m) {
		int cho = n / c, wrap = cho;

		while (wrap >= m) {
			cho += wrap / m;
			wrap = wrap / m + wrap % m;

		}

		return cho;
	}
