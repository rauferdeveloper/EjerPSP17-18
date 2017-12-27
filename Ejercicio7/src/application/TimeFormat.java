package application;

public class TimeFormat {
	public static String fromMsToChrono(long mills) {
		int decimas=(int)mills/100;
		int segundos=(int)mills/1000;
		int minutos=segundos/60;
		return minutos+":"+(segundos%60)+":"+(decimas%10);
	}

}
