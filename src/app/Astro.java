package app;

public class Astro {
	public static void getZodiacSign(int date,String month) {
		switch(month) {
		case "march":
			if(date>=21)
				System.out.println("Aries");
			else
				System.out.println("Pisces");
			break;
		case "april":
			if(date<=19)
				System.out.println("Aries");
			else
				System.out.println("Taurcus");
			break;
		case "may":
			if(date<=20)
				System.out.println("Taurcus");
			else
				System.out.println("Gemini");
			break;
		case "jun":
			if(date<=20)
				System.out.println("Gemini");
			else
				System.out.println("Cancer");
			break;
		case "july":
			if(date<=22)
				System.out.println("Cancer");
			else
				System.out.println("Leo");
			break;
		case "august":
			if(date<=22)
				System.out.println("Leo");
			else
				System.out.println("Virgo");
			break;
		case "september":
			if(date<=22)
				System.out.println("Virgo");
			else
				System.out.println("Libra");
			break;
		case "october":
			if(date<=22)
				System.out.println("Libra");
			else
				System.out.println("Scorpio");
			break;
		case "november":
			if(date<=21)
				System.out.println("Scorpio");
			else
				System.out.println("Sagittarius");
			break;
		case "december":
			if(date<=21)
				System.out.println("Sagittarius");
			else
				System.out.println("Carpricorn");
			break;
		case "jan":
			if(date<=19)
				System.out.println("Carpricorn");
			else
				System.out.println("Aquarius");
			break;
		case "feb":
			if(date<=18)
				System.out.println("Aquarius");
			else
				System.out.println("Pisces");
			break;
		default:
			System.out.println("Wrong input");
		}
	}

}
