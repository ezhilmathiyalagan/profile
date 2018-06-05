package com.personal;

public abstract class Animals implements Travel {
}

	class Cats extends Animals{

		@Override
		public int getSpeed() {
			return 0;
		}
	}
		class Dogs extends Animals{

			@Override
			public int getSpeed() {
				return 0;
			}
		}
	class Tiger extends Animals{

		@Override
		public int getSpeed() {
			return 0;
		}
}
