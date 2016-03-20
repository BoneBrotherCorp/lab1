package lab1.test;

public class Method {
	//method to unify the number
			public static int unifyNum(double number){
				int theUnit = ((int)(number*100))%10;
				int result;
				if (theUnit >=5) {
					result = ((int)(number*100))/10+1;
				}
				else {
					result = ((int)(number*100))/10;
				}
				return result;
			}
}
