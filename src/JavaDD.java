import java.math.BigDecimal;
import java.math.MathContext;
import java.text.NumberFormat;

public class JavaDD {

	public static void main(String[] args) {

		double a = 0.33333d;
		double b = 0.22222d;

		NumberFormat format = NumberFormat.getInstance();
		format.setMaximumFractionDigits(1);

		System.out.println(format.format(a - b));

		BigDecimal d = new BigDecimal(a);
		BigDecimal e = new BigDecimal(b);
		MathContext context = new MathContext(4);
		String c = d.subtract(e, context).toString();

		System.out.println(c);
		System.out.println("what the fuck");

	}

}
