import static java.lang.Math.*;

class Lab1 {
	public static void main(String args[]) {
		int[] d = {6, 8, 10, 12, 14, 16, 18};
		
		double[] x = new double[19];
		for(int i = 0; i < 19; i++) x[i] = -12 + random()*(11 + 12);

		double[][] matrix = new double[7][19];

		for(int i = 0; i < 7; i++){
			for(int j = 0; j < 19; j++){
				switch(d[i]){

					case(12):
						double num = (pow(tan(x[j]), 2) + 1) / (2*PI);
						double exponent = pow(atan((x[j]-0.5)/23) / 2, exp(x[j]));
						matrix[i][j] = log(pow(num, exponent));
						break;

					case(8):
						continue;
					case(16):
						continue;
					case(18):
						matrix[i][j] = sin(cos(log(abs(x[j]))));
						break;

					default:
						matrix[i][j] = cbrt(cbrt(tan(atan((x[j]-0.5)/23))));
						break;
				}
			}
		}
		for(double[] line : matrix){
			for(double element : line) System.out.printf("%5.2f ", element);
			System.out.println();
		}
	}
}
