public static String timeInWords(int h, int m) {
		StringBuilder s = new StringBuilder();
		String[] minutes = new String[] { " ", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"ninteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
				"twenty six", "twenty seven", "twenty eight", "twenty nine" };

		if (m == 0) {
			// System.out.println(minutes[h] +" o' clock");
			return minutes[h] + " o' clock";
		} else {

			if (m < 30) {
				if (m < 30) {
					if (m == 1)
						return minutes[h] + " minute past " + minutes[m];

					if (m == 15)
						return "quarter past " + minutes[h];

					return minutes[m] + " minutes past " + minutes[h];
				}

			} else {
				// 30 -60

				if (m == 30)
					return "half past " + minutes[h];

				if (m > 30) {
					if (m == 45)
						return "quarter to " + minutes[h + 1];

					int toNext = 60 - m;

					if (toNext == 1)
						return minutes[toNext] + " minute to " + minutes[h + 1];

					return minutes[toNext] + " minutes to " + minutes[h + 1];

				}

			}

		}

		// System.out.println(s);
		return "";
	}
