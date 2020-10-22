import static java.lang.Math.*;

public class Lab1 {
	public static double rand(double a, double b){ // a-low, b-up
		return random() * b + a;
}
	public static double f1(double x){
		return atan(pow(pow(((x - 3) / 18), 2), 2));
}
	public static double f2(double x){
		return log(exp(pow(tan(x), (0.5 * x))));
}
	public static double f3(double x){
		return log(pow(tan(asin(1 / exp(pow(acos((x - 3) / 18),exp(pow((1.0 / 2 * x), 2)))))), 2));
}
        public static void main (String[] args) {
                long d[] = new long[8];
                for (int i = 15; i > 0; i -= 2) {
                        d[(15 - i) / 2] = i; //Заполнение массива d нечетными числами в убывающем порядке
                //      System.out.println(d[(15-i)/2]);
                }
                double x[] = new double[17];
                for (int i = 0; i < 17; i++) {
                        x[i]= rand(-12.0, 6.0);   //заполнение x рандомными числами из диапазона [-12.0; 6.0)
                        //System.out.println(x[i]);
                }
                double l[][] = new double[8][17]; //т.к. d занятно, пусть будет l
                for (int i = 0; i < 8; i++){
                        for (int j = 0; j < 17; j++){
                                switch((int)d[i]){  // в зависимости от d[i] разные функции для итогового результата
                                        case 1:
                                                l[i][j] = f1(x[j]);
                                                break;
                                        case 3:
                                        case 7:
                                        case 11:
                                        case 13:
                                                l[i][j] = f2(x[j]);;
                                                break;
                                        default:
                                                l[i][j] = f3(x[j]);
                                }
                        System.out.printf("%7.2f ",l[i][j]); // на числа отведены 7 знаков + пробел
                        }

                }
        }
}
