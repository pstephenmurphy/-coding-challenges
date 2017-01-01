package coding.challenges;

import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Currency;
import java.util.Locale;

public class Solution {

	public static Locale INDIA = null;

	public SortedMap<Currency, Locale> currencyLocaleMap;

	private Scanner scanner;

	public Solution(Scanner scanner) {
		this.scanner = scanner;
		initCurrencyMap();
	}

	public Double getPayment() {
		return Double.valueOf(scanner.nextDouble());
	}

	private void initCurrencyMap() {
		currencyLocaleMap = new TreeMap<Currency, Locale>(new Comparator<Currency>() {
			public int compare(Currency c1, Currency c2) {
				return c1.getCurrencyCode().compareTo(c2.getCurrencyCode());
			}
		});

		for (Locale locale : Locale.getAvailableLocales()) {
			try {
				Currency currency;
				if ("IND".equals(locale.getISO3Country())) {
					INDIA = locale;
					currency = Currency.getInstance("INR");
				}
				else
					currency = Currency.getInstance(locale);
				currencyLocaleMap.put(currency, locale);
			} catch (Exception e) {
			}
		}
	}

	public static void main(String[] args) {

		Solution solution = new Solution(new Scanner(System.in));

		Double payment = solution.getPayment();

		try {
			System.out.println(String.format("%s: %s%s", "US", solution.getCurrencySymbol(Locale.US),
					solution.getFormattedPayment(payment, Locale.US)));

			System.out.println(String.format("%s: %s%s", "India", solution.getCurrencySymbol(INDIA),
					solution.getFormattedPayment(payment, INDIA)));

			System.out.println(String.format("%s: %s%s", "China", solution.getCurrencySymbol(Locale.CHINA),
					solution.getFormattedPayment(payment, Locale.CHINA)));

			System.out.println(String.format("%s: %s %s", "France",
					solution.getFormattedPayment(payment, Locale.FRANCE), solution.getCurrencySymbol(Locale.FRANCE)));
		} finally {
			solution.close();
		}
	}

	public String getFormattedPayment(Double payment, Locale locale) {
		NumberFormat numberFormatter = NumberFormat.getInstance(locale);
		numberFormatter.setMaximumFractionDigits(2);
		numberFormatter.setMinimumFractionDigits(2);

		return numberFormatter.format(payment.doubleValue());
	}

	public String getCurrencySymbol(Locale locale) {
		Currency currency = Currency.getInstance(locale);
		return currency.getSymbol(locale);
	}

	public void close() {
		scanner.close();
	}
}
